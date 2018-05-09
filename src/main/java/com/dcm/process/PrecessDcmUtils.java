package com.dcm.process;

import com.dcm.domin.inner.Image;
import com.dcm.domin.inner.OneImage;
import com.dcm.domin.inner.PieceOfDicomObj;
import com.dcm.domin.middle.PartOfDicomObj;
import com.dcm.domin.middle.PartOfPatient;
import com.dcm.domin.middle.PartOfSeries;
import com.dcm.domin.outer.Patient;
import com.dcm.domin.outer.PublicDicomObj;
import com.dcm.domin.outer.PublicSeries;
import com.dcm.domin.outer.Study;
import com.dcm.utils.DisplayTag;
import com.dcm.utils.TraverseFolder;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.Tag;
import org.dcm4che3.data.VR;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Created by Eric
 * @Date: 2017/11/7
 * @Description:
 */
public class PrecessDcmUtils {

	private TraverseFolder traverseFolder = new TraverseFolder();
	private Logger logger = LoggerFactory.getLogger(Object.class);
	private File file;
	private List<String> fileList;




	/**
	* @Author: GaoYanping
	* @Description: 外层数据解析
	* @Date: 15:23 2017/11/7
	*/
	public List<Patient> precessOuter(String path){
//		TraverseFolder traverseFolder = new TraverseFolder();
//		File file;
		fileList = traverseFolder.getAllDcm(new File(path));
		List<Patient> patientList =  new LinkedList<Patient>();

		Patient patient;
		Study study;
		PublicSeries series;
		PublicDicomObj obj;
		for (int i =0; i < fileList.size();i++){

			List<PublicSeries> seriesList = new LinkedList<PublicSeries>();
			List<PublicDicomObj> objList = new LinkedList<PublicDicomObj>();
			List<Study> studies = new LinkedList<Study>();

			patient = new Patient();
			series = new PublicSeries();
			obj = new PublicDicomObj();
			study = new Study();

			file = new File(fileList.get(i));
			DisplayTag d = new DisplayTag(file);
			@SuppressWarnings("static-access")
			Attributes attr = null;
			try {
				attr = d.loadDicomObject(file);
				//转字符编码为gb18030
				attr.setString(Tag.SpecificCharacterSet, VR.CS, "GB18030");


				//解析patient
				patient.setPatientName(attr.getString(Tag.PatientName));
				patient.setPatientID(attr.getString(Tag.PatientID));
				patient.setPatientSex(attr.getString(Tag.PatientSex));
				patient.setPatientAge(attr.getString(Tag.PatientAge));
				//解析study
				study.setStudyInstanceUID(attr.getString(Tag.StudyInstanceUID));
				study.setStudyDate(attr.getString(Tag.StudyDate));
				study.setStudyID(attr.getString(Tag.StudyID));
				//解析series
				series.setSeriesDate(attr.getString(Tag.SeriesDate));
				series.setModality(attr.getString(Tag.Modality));
				series.setInstitutionName(attr.getString(Tag.InstitutionName));
				//解析DICOM Object
				obj.setTransferSyntaxUID(attr.getString(Tag.TransferSyntaxUID));
				obj.setPhotometricInterpretation(attr.getString(Tag.PhotometricInterpretation));
				obj.setSamplesPerPixel(attr.getString(Tag.SamplesPerPixel));
				obj.setPixelRepresentation(attr.getString(Tag.PixelRepresentation));
				obj.setBitsAllocated(attr.getString(Tag.BitsAllocated));
				obj.setBitsStored(attr.getString(Tag.BitsStored));

				//把series、DICOM Object、Image添加到study
//				seriesList.add(series);
				objList.add(obj);
				studies.add(study);
				seriesList.add(series);
				patient.setPublicSeries(seriesList);
				patient.setPublicDicomObjs(objList);
				patient.setStudies(studies);
				//添加study

			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				boolean b = patientList.add(patient);
				if (b){
					logger.info("外层解析成功！");
				}else {
					logger.error("请稍后再试！");
				}
			}
		}

//		System.out.println(patientList1);
		return patientList;
	}


	/**
	* @Author: GaoYanping
	* @Description: 中层数据解析
	* @Date: 15:24 2017/11/7
	*/
	public List<PartOfPatient> precessMiddle(String path){
		fileList = traverseFolder.getAllDcm(new File(path));
		List<PartOfPatient> patientList =  new LinkedList<PartOfPatient>();

		PartOfPatient patient;
		PartOfSeries series;
		PartOfDicomObj obj;
		for (int i =0; i < fileList.size();i++){

			List<PartOfSeries> seriesList = new LinkedList<PartOfSeries>();
			List<PartOfDicomObj> objList = new LinkedList<PartOfDicomObj>();

			patient = new PartOfPatient();
			series = new PartOfSeries();
			obj = new PartOfDicomObj();

			file = new File(fileList.get(i));
			DisplayTag d = new DisplayTag(file);
			@SuppressWarnings("static-access")
			Attributes attr = null;
			try {
				attr = d.loadDicomObject(file);
				//转字符编码为gb18030
				attr.setString(Tag.SpecificCharacterSet, VR.CS, "GB18030");


				//解析series
				series.setSeriesInstanceUID(attr.getString(Tag.SeriesInstanceUID));
				series.setSeriesNumber(attr.getString(Tag.SeriesNumber));
				//解析DICOM Object
				obj.setImageType(attr.getString(Tag.ImageType));
				obj.setColumns(attr.getString(Tag.Columns));
				obj.setRows(attr.getString(Tag.Rows));

				patient.setStudyInstanceUid(attr.getString(Tag.StudyInstanceUID));

				//把series、DICOM Object、Image添加到study
//				seriesList.add(series);
				objList.add(obj);
				seriesList.add(series);
				patient.setPartOfSeries(seriesList);
				patient.setPartOfDicomObjs(objList);

			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				boolean b = patientList.add(patient);
				if (b){
					logger.info("中层解析成功！");
				}else {
					logger.error("请稍后再试！");
				}
			}
		}
//		System.out.println(patientList);
		return patientList;
	}

	/**
	* @Author: GaoYanping
	* @Description: 内层解析数据
	* @Date: 15:26 2017/11/7
	*/
	public List<OneImage> precessInner(String path){
		fileList = traverseFolder.getAllDcm(new File(path));
		List<OneImage> oneImages =  new LinkedList<OneImage>();

		OneImage oneImage;
		Image image;
		PieceOfDicomObj obj;
		for (int i =0; i < fileList.size();i++){

			List<Image> images = new LinkedList<Image>();
			List<PieceOfDicomObj> objList = new LinkedList<PieceOfDicomObj>();

			oneImage = new OneImage();
			image = new Image();
			obj = new PieceOfDicomObj();

			file = new File(fileList.get(i));
			DisplayTag d = new DisplayTag(file);
			@SuppressWarnings("static-access")
			Attributes attr = null;
			try {
				attr = d.loadDicomObject(file);
				//转字符编码为gb18030
				attr.setString(Tag.SpecificCharacterSet, VR.CS, "GB18030");


				//解析obj
				obj.setSopInstanceUID(attr.getString(Tag.SOPInstanceUID));
				obj.setInstanceNumber(attr.getString(Tag.InstanceNumber));
				//解析Image
				image.setPixelSpacing(attr.getString(Tag.PixelSpacing));
				image.setSliceLocation(attr.getString(Tag.SliceLocation));
				image.setSliceThickness(attr.getString(Tag.SliceThickness));
				image.setImagePositionPatient(attr.getString(Tag.ImagePositionPatient));
				image.setImageOrientation(attr.getString(Tag.ImageOrientation));


				oneImage.setStudyInstanceUID(attr.getString(Tag.StudyInstanceUID));
				oneImage.setSeriesInstanceUID(attr.getString(Tag.SeriesInstanceUID));
				oneImage.setSeriesNumber(attr.getString(Tag.SeriesNumber));


				//把series、DICOM Object、Image添加到study
//				seriesList.add(series);
				objList.add(obj);
				images.add(image);
				oneImage.setImages(images);
				oneImage.setPieceOfDicomObjs(objList);

			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				boolean b = oneImages.add(oneImage);
				if (b){
					logger.info("内层解析成功！");
				}else {
					logger.error("请稍后再试！");
				}
			}
		}
		System.out.println(oneImages);
		return oneImages;
	}

}
