package com.dcm.process.initiator;

import com.dcm.domin.packaging.OneImageList;
import com.dcm.domin.packaging.PartOfPatientList;
import com.dcm.domin.packaging.PatientList;
import com.dcm.process.PrecessDcmUtils;
import com.dcm.process.filter.RepetitiveFilter;

/**
 * @Author: Created by Eric
 * @Date: 2017/11/7
 * @Description:
 */
public class DoPrecess {


	private String path = "F:\\dcm";



	/**
	* @Author: GaoYanping
	* @Description: 启动器，全部解析
	* @Date: 15:49 2017/11/7
	*/
	public void run(){
		doPrecessOuter();
		doPrecessMiddle();
		doPrecessInner();
	}

	/**
	 * @Author: GaoYanping
	 * @Description: 外层解析启动器
	 * @Date: 15:43 2017/11/7
	 */
	public PatientList doPrecessOuter(){
		PatientList patientList = new PatientList();
		patientList.setPatients(RepetitiveFilter.outerFilter(new PrecessDcmUtils().precessOuter(path)));
		return patientList;
	}
	/**
	 * @Author: GaoYanping
	 * @Description: 中层解析启动器
	 * @Date: 15:43 2017/11/7
	 */
	public PartOfPatientList doPrecessMiddle(){
		PartOfPatientList partPatientList = new PartOfPatientList();
		partPatientList.setPartOfPatients(RepetitiveFilter.middleFilter(new PrecessDcmUtils().precessMiddle(path)));
		return partPatientList;
	}
	/**
	* @Author: GaoYanping
	* @Description: 内层解析启动器
	* @Date: 15:43 2017/11/7
	*/
	public void doPrecessInner(){
		OneImageList oneImageList = new OneImageList();
		oneImageList.setOneImages(RepetitiveFilter.innerFilter(new PrecessDcmUtils().precessInner(path)));
	}
}
