package com.dcm.utils;

import org.springframework.stereotype.Component;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


/**
* @Author: GaoYanping
* @Description: 遍历指定文件夹下的所有文件，并返回所有文件的集合（目录不会被返回）
* @Date: 11:21 2017/10/30
*/

@Component
public class TraverseFolder {

	private List<String> list = new ArrayList<String>();

	public List<String> getAllDcm(File dir){
		//调用File对象方法listFiles()获取,加入过滤器
		File[] fileArr = dir.listFiles(new DicomFilter());
		for(File f : fileArr){
			//对f路径,判断是不是文件夹
			if(f.isDirectory()){
				//递归进入文件夹遍历
				getAllDcm(f);
			}else{
				String s = f.toString();
				list.add(s);
//				System.out.println(f);
			}
		}
		return list;
	}
}
