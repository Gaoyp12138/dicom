package com.dcm.domin.middle;

/**
 * @Author: Created by Eric
 * @Date: 2017/11/1
 * @Description:
 */
public class PartOfSeries {

	private String seriesInstanceUID;
	private String seriesNumber;

	public PartOfSeries() {}

	public PartOfSeries(String seriesInstanceUID, String seriesNumber) {
		this.seriesInstanceUID = seriesInstanceUID;
		this.seriesNumber = seriesNumber;
	}

	public String getSeriesInstanceUID() {
		return seriesInstanceUID;
	}

	public void setSeriesInstanceUID(String seriesInstanceUID) {
		this.seriesInstanceUID = seriesInstanceUID;
	}

	public String getSeriesNumber() {
		return seriesNumber;
	}

	public void setSeriesNumber(String seriesNumber) {
		this.seriesNumber = seriesNumber;
	}

	@Override
	public String toString() {
		return "PartOfSeries{" +
				"seriesInstanceUID='" + seriesInstanceUID + '\'' +
				", seriesNumber='" + seriesNumber + '\'' +
				'}';
	}
}
