package com.dcm.domin.outer;

/**
 * @Author: Created by Eric
 * @Date: 2017/11/1
 * @Description:
 */
public class Study {
	private String studyInstanceUID;
	private String studyDate;
	private String studyID;
	private String studyDescription;

	//构造函数，空参有参


	public Study() {}

	public Study(String studyInstanceUID, String studyDate, String studyID, String studyDescription) {
		this.studyInstanceUID = studyInstanceUID;
		this.studyDate = studyDate;
		this.studyID = studyID;
		this.studyDescription = studyDescription;
	}

	public String getStudyInstanceUID() {
		return studyInstanceUID;
	}

	public void setStudyInstanceUID(String studyInstanceUID) {
		this.studyInstanceUID = studyInstanceUID;
	}

	public String getStudyDate() {
		return studyDate;
	}

	public void setStudyDate(String studyDate) {
		this.studyDate = studyDate;
	}

	public String getStudyID() {
		return studyID;
	}

	public void setStudyID(String studyID) {
		this.studyID = studyID;
	}

	public String getStudyDescription() {
		return studyDescription;
	}

	public void setStudyDescription(String studyDescription) {
		this.studyDescription = studyDescription;
	}

	@Override
	public String toString() {
		return "Study{" +
				"studyInstanceUID='" + studyInstanceUID + '\'' +
				", studyDate='" + studyDate + '\'' +
				", studyID='" + studyID + '\'' +
				", studyDescription='" + studyDescription + '\'' +
				'}';
	}
}
