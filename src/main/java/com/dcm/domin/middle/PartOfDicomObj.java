package com.dcm.domin.middle;

/**
 * @Author: Created by Eric
 * @Date: 2017/11/1
 * @Description:
 */
public class PartOfDicomObj {

	private String imageType;
	private String columns;
	private String rows;

	public PartOfDicomObj() {}

	public PartOfDicomObj(String imageType, String columns, String rows) {
		this.imageType = imageType;
		this.columns = columns;
		this.rows = rows;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public String getColumns() {
		return columns;
	}

	public void setColumns(String columns) {
		this.columns = columns;
	}

	public String getRows() {
		return rows;
	}

	public void setRows(String rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "PartOfDicomObj{" +
				"imageType='" + imageType + '\'' +
				", columns='" + columns + '\'' +
				", rows='" + rows + '\'' +
				'}';
	}
}
