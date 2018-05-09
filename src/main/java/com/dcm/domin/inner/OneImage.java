package com.dcm.domin.inner;

import java.util.List;

/**
 * @Author: Created by Eric
 * @Date: 2017/11/1
 * @Description: 每一张自己的
 */
public class OneImage {

	private String studyInstanceUID;
	private String seriesInstanceUID;
	private String seriesNumber;
	private List<PieceOfDicomObj> pieceOfDicomObjs;
	private List<Image> images;

	public OneImage() {
	}

	public OneImage(String studyInstanceUID, String seriesInstanceUID, String seriesNumber, List<PieceOfDicomObj> pieceOfDicomObjs, List<Image> images) {
		this.studyInstanceUID = studyInstanceUID;
		this.seriesInstanceUID = seriesInstanceUID;
		this.seriesNumber = seriesNumber;
		this.pieceOfDicomObjs = pieceOfDicomObjs;
		this.images = images;
	}

	public String getStudyInstanceUID() {
		return studyInstanceUID;
	}

	public void setStudyInstanceUID(String studyInstanceUID) {
		this.studyInstanceUID = studyInstanceUID;
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

	public List<PieceOfDicomObj> getPieceOfDicomObjs() {
		return pieceOfDicomObjs;
	}

	public void setPieceOfDicomObjs(List<PieceOfDicomObj> pieceOfDicomObjs) {
		this.pieceOfDicomObjs = pieceOfDicomObjs;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	@Override
	public String toString() {
		return "OneImage{" +
				"studyInstanceUID='" + studyInstanceUID + '\'' +
				", seriesInstanceUID='" + seriesInstanceUID + '\'' +
				", seriesNumber='" + seriesNumber + '\'' +
				", pieceOfDicomObjs=" + pieceOfDicomObjs +
				", images=" + images +
				'}';
	}
}
