package com.dcm.dao;

import com.dcm.domin.outer.Study;
import com.dcm.domin.packaging.AllStudy;

import java.util.List;

/**
 * @Author: Created by Eric
 * @Date: 2017/11/7
 * @Description:
 */
public interface DcmDao {

	AllStudy findAll();
	AllStudy findDcmByStudyInstanceUID(String studyInstanceUID);
}
