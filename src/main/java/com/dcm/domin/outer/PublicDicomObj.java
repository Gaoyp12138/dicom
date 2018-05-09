package com.dcm.domin.outer;

/**
 * @Author: Created by Eric
 * @Date: 2017/11/1
 * @Description:  同一病人不同类型影像相同部分obj
 */
public class PublicDicomObj {
	private String transferSyntaxUID;
	private String photometricInterpretation;
	private String samplesPerPixel;
	private String pixelRepresentation;
	private String bitsAllocated;
	private String bitsStored;

	public PublicDicomObj() {}

	public PublicDicomObj(String transferSyntaxUID, String photometricInterpretation, String samplesPerPixel, String pixelRepresentation, String bitsAllocated, String bitsStored) {
		this.transferSyntaxUID = transferSyntaxUID;
		this.photometricInterpretation = photometricInterpretation;
		this.samplesPerPixel = samplesPerPixel;
		this.pixelRepresentation = pixelRepresentation;
		this.bitsAllocated = bitsAllocated;
		this.bitsStored = bitsStored;
	}

	public String getTransferSyntaxUID() {
		return transferSyntaxUID;
	}

	public void setTransferSyntaxUID(String transferSyntaxUID) {
		this.transferSyntaxUID = transferSyntaxUID;
	}

	public String getPhotometricInterpretation() {
		return photometricInterpretation;
	}

	public void setPhotometricInterpretation(String photometricInterpretation) {
		this.photometricInterpretation = photometricInterpretation;
	}

	public String getSamplesPerPixel() {
		return samplesPerPixel;
	}

	public void setSamplesPerPixel(String samplesPerPixel) {
		this.samplesPerPixel = samplesPerPixel;
	}

	public String getPixelRepresentation() {
		return pixelRepresentation;
	}

	public void setPixelRepresentation(String pixelRepresentation) {
		this.pixelRepresentation = pixelRepresentation;
	}

	public String getBitsAllocated() {
		return bitsAllocated;
	}

	public void setBitsAllocated(String bitsAllocated) {
		this.bitsAllocated = bitsAllocated;
	}

	public String getBitsStored() {
		return bitsStored;
	}

	public void setBitsStored(String bitsStored) {
		this.bitsStored = bitsStored;
	}

	@Override
	public String toString() {
		return "PublicDicomObj{" +
				"transferSyntaxUID='" + transferSyntaxUID + '\'' +
				", photometricInterpretation='" + photometricInterpretation + '\'' +
				", samplesPerPixel='" + samplesPerPixel + '\'' +
				", pixelRepresentation='" + pixelRepresentation + '\'' +
				", bitsAllocated='" + bitsAllocated + '\'' +
				", bitsStored='" + bitsStored + '\'' +
				'}';
	}
}
