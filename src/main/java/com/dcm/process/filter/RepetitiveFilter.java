package com.dcm.process.filter;

import com.dcm.domin.inner.OneImage;
import com.dcm.domin.middle.PartOfPatient;
import com.dcm.domin.outer.Patient;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Created by Eric
 * @Date: 2017/11/7
 * @Description:
 */
public class RepetitiveFilter {


	/**
	* @Author: GaoYanping
	* @Description: 外层过滤器，相同结构只存储一份，并过滤报告，报告特点modality的value值为SR\OR\OT
	* @Date: 15:08 2017/11/7
	*/
	public static List<Patient> outerFilter(List<Patient> patientList){

		List<Patient> patientList1 =  new LinkedList<Patient>();
		patientList1.add(patientList.get(0));
		for (int i = 0; i < patientList.size()-1;i++){
			if (! patientList.get(i+1).toString().equals(patientList.get(i).toString())){
				patientList1.add(patientList.get(i+1));
			}
		}

		for (int i = 0; i < patientList1.size();i++){
			if (patientList1.get(i).toString().indexOf("modality='SR'") != -1 ||
					patientList1.get(i).toString().indexOf("modality='OR'") != -1||
					patientList1.get(i).toString().indexOf("modality='OT'") != -1){
				patientList1.remove(patientList1.get(i));
				i--;
			}
		}
		return patientList1;

	}


	/**
	* @Author: GaoYanping
	* @Description: 中层过滤器，相同结构只存储一份，并过滤报告，特点为ImageType值为空
	* @Date: 15:09 2017/11/7
	*/
	public static List<PartOfPatient> middleFilter(List<PartOfPatient> patientList){
		List<PartOfPatient> patientList1 =  new LinkedList<PartOfPatient>();
		patientList1.add(patientList.get(0));
		for (int i = 0; i < patientList.size()-1;i++){
			if (! patientList.get(i+1).toString().equals(patientList.get(i).toString())){
				patientList1.add(patientList.get(i+1));
			}
		}

		for (int i = 0; i < patientList1.size();i++){
			if (patientList1.get(i).toString().indexOf("imageType='null'") != -1){
				patientList1.remove(patientList1.get(i));
				i--;
			}
		}
		return patientList1;
	}



	/**
	* @Author: GaoYanping
	* @Description: 内层过滤器
	* @Date: 15:12 2017/11/7
	*/
	public static List<OneImage> innerFilter(List<OneImage> oneImages){
		List<OneImage> oneImages1 =  new LinkedList<OneImage>();
		oneImages1.add(oneImages.get(0));
		for (int i = 0; i < oneImages.size()-1;i++){
			if (! oneImages.get(i+1).toString().equals(oneImages.get(i).toString())){
				oneImages1.add(oneImages.get(i+1));
			}
		}

//		for (int i = 0; i < oneImages1.size();i++){
//			if (oneImages1.get(i).toString().indexOf("imageType='null'") != -1){
//				oneImages1.remove(oneImages1.get(i));
//				i--;
//			}
//		}
		return oneImages1;
	}


}
