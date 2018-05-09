package com.dcm.service;

import com.dcm.domin.packaging.AllStudy;

/**
 * @Author: Created by Eric
 * @Date: 2017/11/7
 * @Description:
 */
public interface DcmService {
	AllStudy findAll();
	AllStudy findDcmByStudyInstanceUID(String studyInstanceUID);
}
