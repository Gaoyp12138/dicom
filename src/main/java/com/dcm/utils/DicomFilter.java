package com.dcm.utils;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileFilter;

/**
 * @Author: Created by Eric
 * @Date: 2017/10/25
 * @Description: 过滤出所有后缀名为 .dcm的文件
 */
@Component
public class DicomFilter implements FileFilter{
	public boolean accept(File pathname) {
		//判断获取的是目录,直接返回true
		if(pathname.isDirectory())
			return true;
		return pathname.getName().toLowerCase().endsWith(".dcm");
	}
}
