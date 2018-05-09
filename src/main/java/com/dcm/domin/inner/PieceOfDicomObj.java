package com.dcm.domin.inner;

/**
 * @Author: Created by Eric
 * @Date: 2017/11/1
 * @Description:
 */
public class PieceOfDicomObj {

	private String sopInstanceUID;
	private String instanceNumber;

	public PieceOfDicomObj() {}

	public PieceOfDicomObj(String sopInstanceUID, String instanceNumber) {
		this.sopInstanceUID = sopInstanceUID;
		this.instanceNumber = instanceNumber;
	}

	public String getSopInstanceUID() {
		return sopInstanceUID;
	}

	public void setSopInstanceUID(String sopInstanceUID) {
		this.sopInstanceUID = sopInstanceUID;
	}

	public String getInstanceNumber() {
		return instanceNumber;
	}

	public void setInstanceNumber(String instanceNumber) {
		this.instanceNumber = instanceNumber;
	}

	@Override
	public String toString() {
		return "PieceOfDicomObj{" +
				"sopInstanceUID='" + sopInstanceUID + '\'' +
				", instanceNumber='" + instanceNumber + '\'' +
				'}';
	}
}
