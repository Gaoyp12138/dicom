package com.dcm.domin.middle;

import java.util.List;

/**
 * @Author: Created by Eric
 * @Date: 2017/11/1
 * @Description:  同一部位相同的
 */
public class PartOfPatient {


	private String studyInstanceUID;
	private List<PartOfSeries> partOfSeries;
	private List<PartOfDicomObj> partOfDicomObjs;

	public PartOfPatient() {
	}

	public PartOfPatient(String studyInstanceUID, List<PartOfSeries> partOfSeries, List<PartOfDicomObj> partOfDicomObjs) {
		this.studyInstanceUID = studyInstanceUID;
		this.partOfSeries = partOfSeries;
		this.partOfDicomObjs = partOfDicomObjs;
	}

	public String getStudyInstanceUid() {
		return studyInstanceUID;
	}

	public void setStudyInstanceUid(String studyInstanceUid) {
		this.studyInstanceUID = studyInstanceUid;
	}

	public List<PartOfSeries> getPartOfSeries() {
		return partOfSeries;
	}

	public void setPartOfSeries(List<PartOfSeries> partOfSeries) {
		this.partOfSeries = partOfSeries;
	}

	public List<PartOfDicomObj> getPartOfDicomObjs() {
		return partOfDicomObjs;
	}

	public void setPartOfDicomObjs(List<PartOfDicomObj> partOfDicomObjs) {
		this.partOfDicomObjs = partOfDicomObjs;
	}

	@Override
	public String toString() {
		return "PartOfPatient{" +
				"studyInstanceUID='" + studyInstanceUID + '\'' +
				", partOfSeries=" + partOfSeries +
				", partOfDicomObjs=" + partOfDicomObjs +
				'}';
	}
}
