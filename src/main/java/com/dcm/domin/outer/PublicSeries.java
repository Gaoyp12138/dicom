package com.dcm.domin.outer;

/**
 * @Author: Created by Eric
 * @Date: 2017/11/1
 * @Description: 同一个病人所拍不同部位影像相同的series
 */
public class PublicSeries {
	private String seriesDate;
	private String modality;
	private String institutionName;

	public PublicSeries() {}

	public PublicSeries(String seriesDate, String modality, String institutionName) {
		this.seriesDate = seriesDate;
		this.modality = modality;
		this.institutionName = institutionName;
	}

	public String getSeriesDate() {
		return seriesDate;
	}

	public void setSeriesDate(String seriesDate) {
		this.seriesDate = seriesDate;
	}

	public String getModality() {
		return modality;
	}

	public void setModality(String modality) {
		this.modality = modality;
	}

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	@Override
	public String toString() {
		return "PublicSeries{" +
				"seriesDate='" + seriesDate + '\'' +
				", modality='" + modality + '\'' +
				", institutionName='" + institutionName + '\'' +
				'}';
	}
}
