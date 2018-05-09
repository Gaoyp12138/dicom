package com.dcm.domin.packaging;


import com.dcm.domin.middle.PartOfPatient;

import java.util.List;

/**
 * @Author: Created by Eric
 * @Date: 2017/11/2
 * @Description: 由于springMVC不能传递List<T>参数，故而封装为对象进行传参
 */
public class PartOfPatientList {

	List<PartOfPatient> partOfPatients;

	public PartOfPatientList() {
	}

	public PartOfPatientList(List<PartOfPatient> partOfPatients) {
		this.partOfPatients = partOfPatients;
	}

	public List<PartOfPatient> getPartOfPatients() {
		return partOfPatients;
	}

	public void setPartOfPatients(List<PartOfPatient> partOfPatients) {
		this.partOfPatients = partOfPatients;
	}

	@Override
	public String toString() {
		return "PartOfPatientList{" +
				"partOfPatients=" + partOfPatients +
				'}';
	}
}
