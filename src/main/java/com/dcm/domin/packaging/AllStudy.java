package com.dcm.domin.packaging;

import com.dcm.domin.inner.OneImage;
import com.dcm.domin.middle.PartOfPatient;
import com.dcm.domin.outer.Patient;

import java.util.List;

/**
 * @Author: Created by Eric
 * @Date: 2017/11/7
 * @Description:
 */
public class AllStudy {

	List<Patient> patients;
	List<PartOfPatient> partOfPatients;
	List<OneImage> oneImages;

	public AllStudy() {
	}

	public AllStudy(List<Patient> patients, List<PartOfPatient> partOfPatients, List<OneImage> oneImages) {
		this.patients = patients;
		this.partOfPatients = partOfPatients;
		this.oneImages = oneImages;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	public List<PartOfPatient> getPartOfPatients() {
		return partOfPatients;
	}

	public void setPartOfPatients(List<PartOfPatient> partOfPatients) {
		this.partOfPatients = partOfPatients;
	}

	public List<OneImage> getOneImages() {
		return oneImages;
	}

	public void setOneImages(List<OneImage> oneImages) {
		this.oneImages = oneImages;
	}

	@Override
	public String toString() {
		return "AllStudy{" +
				"patients=" + patients +
				", partOfPatients=" + partOfPatients +
				", oneImages=" + oneImages +
				'}';
	}
}
