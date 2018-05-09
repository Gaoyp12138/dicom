package com.dcm.domin.outer;

import java.util.List;

/**
 * @Author: Created by Eric
 * @Date: 2017/11/1
 * @Description: 一个病人所有部位片子的公共部分
 */
public class Patient {
	private String patientName;
	private String patientID;
	private String patientSex;
	private String patientAge;
	//同一个病人的Study信息都是相同的
	private List<Study> studies;
	//同一个病人下相同的series、dicomObj信息
	private List<PublicSeries> publicSeries;
	private List<PublicDicomObj> publicDicomObjs;

	public Patient() {}

	public Patient(String patientName, String patientID, String patientSex, String patientAge, List<Study> studies, List<PublicSeries> publicSeries, List<PublicDicomObj> publicDicomObjs) {
		this.patientName = patientName;
		this.patientID = patientID;
		this.patientSex = patientSex;
		this.patientAge = patientAge;
		this.studies = studies;
		this.publicSeries = publicSeries;
		this.publicDicomObjs = publicDicomObjs;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientID() {
		return patientID;
	}

	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	public String getPatientSex() {
		return patientSex;
	}

	public void setPatientSex(String patientSex) {
		this.patientSex = patientSex;
	}

	public String getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}

	public List<Study> getStudies() {
		return studies;
	}

	public void setStudies(List<Study> studies) {
		this.studies = studies;
	}

	public List<PublicSeries> getPublicSeries() {
		return publicSeries;
	}

	public void setPublicSeries(List<PublicSeries> publicSeries) {
		this.publicSeries = publicSeries;
	}

	public List<PublicDicomObj> getPublicDicomObjs() {
		return publicDicomObjs;
	}

	public void setPublicDicomObjs(List<PublicDicomObj> publicDicomObjs) {
		this.publicDicomObjs = publicDicomObjs;
	}

	@Override
	public String toString() {
		return "Patient{" +
				"patientName='" + patientName + '\'' +
				", patientID='" + patientID + '\'' +
				", patientSex='" + patientSex + '\'' +
				", patientAge='" + patientAge + '\'' +
				", studies=" + studies +
				", publicSeries=" + publicSeries +
				", publicDicomObjs=" + publicDicomObjs +
				'}';
	}
}
