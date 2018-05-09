package com.dcm.domin.inner;

/**
 * @Author: Created by Eric
 * @Date: 2017/11/1
 * @Description:
 */
public class Image {

	/**
	 * @Author: GaoYanping
	 * @Description:  像素间距、片位置、切片厚度、图像位置病人、形象定位
	 * @Date: 11:28 2017/10/27
	 */
	private String pixelSpacing;
	private String sliceLocation;
	private String sliceThickness;
	private String	imagePositionPatient;
	private String imageOrientation;

	public Image() {}

	public Image(String pixelSpacing, String sliceLocation, String sliceThickness, String imagePositionPatient, String imageOrientation) {
		this.pixelSpacing = pixelSpacing;
		this.sliceLocation = sliceLocation;
		this.sliceThickness = sliceThickness;
		this.imagePositionPatient = imagePositionPatient;
		this.imageOrientation = imageOrientation;
	}

	public String getPixelSpacing() {
		return pixelSpacing;
	}

	public void setPixelSpacing(String pixelSpacing) {
		this.pixelSpacing = pixelSpacing;
	}

	public String getSliceLocation() {
		return sliceLocation;
	}

	public void setSliceLocation(String sliceLocation) {
		this.sliceLocation = sliceLocation;
	}

	public String getSliceThickness() {
		return sliceThickness;
	}

	public void setSliceThickness(String sliceThickness) {
		this.sliceThickness = sliceThickness;
	}

	public String getImagePositionPatient() {
		return imagePositionPatient;
	}

	public void setImagePositionPatient(String imagePositionPatient) {
		this.imagePositionPatient = imagePositionPatient;
	}

	public String getImageOrientation() {
		return imageOrientation;
	}

	public void setImageOrientation(String imageOrientation) {
		this.imageOrientation = imageOrientation;
	}

	@Override
	public String toString() {
		return "Image{" +
				"pixelSpacing='" + pixelSpacing + '\'' +
				", sliceLocation='" + sliceLocation + '\'' +
				", sliceThickness='" + sliceThickness + '\'' +
				", imagePositionPatient='" + imagePositionPatient + '\'' +
				", imageOrientation='" + imageOrientation + '\'' +
				'}';
	}

}
