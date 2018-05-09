package com.dcm.service;

import com.dcm.dao.DcmDao;
import com.dcm.domin.packaging.AllStudy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Created by Eric
 * @Date: 2017/11/7
 * @Description:
 */
@Service
public class DcmServiceImpl implements DcmService {

	@Autowired
	private DcmDao dcmDao;

	private static final Logger logger = LoggerFactory.getLogger(DcmService.class);



	@Override
	public AllStudy findAll() {
		AllStudy all = dcmDao.findAll();
		if (all.toString().isEmpty()){
			logger.error("当前目录下没有存储任何Study");
			return null;
		}else {
			logger.info("查询成功");
			return all;
		}
	}

	@Override
	public AllStudy findDcmByStudyInstanceUID(String studyInstanceUID) {
		AllStudy all = dcmDao.findDcmByStudyInstanceUID(studyInstanceUID);
		if (all.toString().isEmpty()) {
			logger.error("没有StudyInstanceUID为" + studyInstanceUID + "的信息");
			return null;
		} else {
			logger.info("查询成功");
			return all;
		}
	}


}
