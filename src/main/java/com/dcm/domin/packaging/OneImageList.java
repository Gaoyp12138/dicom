package com.dcm.domin.packaging;


import com.dcm.domin.inner.OneImage;

import java.util.List;

/**
 * @Author: Created by Eric
 * @Date: 2017/11/2
 * @Description: 由于springMVC不能传递List<T>参数，故而封装为对象进行传参
 */
public class OneImageList {

	List<OneImage> oneImages;

	public OneImageList() {
	}

	public OneImageList(List<OneImage> oneImages) {
		this.oneImages = oneImages;
	}

	public List<OneImage> getOneImages() {
		return oneImages;
	}

	public void setOneImages(List<OneImage> oneImages) {
		this.oneImages = oneImages;
	}

	@Override
	public String toString() {
		return "OneImageList{" +
				"oneImages=" + oneImages +
				'}';
	}
}
