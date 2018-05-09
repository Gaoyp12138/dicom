package com.dcm.dao;

import com.dcm.domin.inner.OneImage;
import com.dcm.domin.middle.PartOfPatient;
import com.dcm.domin.outer.Patient;
import com.dcm.domin.outer.Study;
import com.dcm.domin.packaging.AllStudy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: Created by Eric
 * @Date: 2017/11/7
 * @Description:
 */
@Component
public class DcmDaoImpl implements DcmDao{

	@Autowired
	private MongoTemplate mongoTemplate;

	/**
	 * @Author: GaoYanping
	 * @Description: 查询数据库所有信息
	 * @Date: 16:54 2017/11/7
	 */
	@Override
	public AllStudy findAll() {
		List<Patient> patients = mongoTemplate.findAll(Patient.class);
		List<PartOfPatient> partPatients = mongoTemplate.findAll(PartOfPatient.class);
		List<OneImage> oneImages = mongoTemplate.findAll(OneImage.class);
		AllStudy allStudy = new AllStudy();
		allStudy.setPatients(patients);
		allStudy.setPartOfPatients(partPatients);
		allStudy.setOneImages(oneImages);

		return allStudy;
	}

	@Override
	public AllStudy findDcmByStudyInstanceUID(String studyInstanceUID) {

		Query query = new Query(Criteria.where("studies.studyInstanceUID").is(studyInstanceUID));
		Query query1 = new Query(Criteria.where("studyInstanceUID").is(studyInstanceUID));
		List<Patient> patients = mongoTemplate.find(query, Patient.class);
		List<PartOfPatient> partPatients = mongoTemplate.find(query1, PartOfPatient.class);
		List<OneImage> oneImages = mongoTemplate.find(query1, OneImage.class);
		AllStudy allStudy = new AllStudy();
		allStudy.setPatients(patients);
		allStudy.setPartOfPatients(partPatients);
		allStudy.setOneImages(oneImages);

		return allStudy;
	}

}
