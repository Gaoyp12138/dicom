package com.dcm.domin.packaging;


import com.dcm.domin.outer.Patient;

import java.util.List;

/**
 * @Author: Created by Eric
 * @Date: 2017/11/2
 * @Description: 由于springMVC不能传递List<T>参数，故而封装为对象进行传参
 */
public class PatientList {

	List<Patient> patients;

	public PatientList() {
	}

	public PatientList(List<Patient> patients) {
		this.patients = patients;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "PatientList{" +
				"patients=" + patients +
				'}';
	}
}
