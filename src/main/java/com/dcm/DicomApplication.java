package com.dcm;

import com.dcm.domin.packaging.PatientList;
import com.dcm.process.PrecessDcmUtils;
import com.dcm.process.filter.RepetitiveFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DicomApplication {

	public static void main(String[] args) {
		SpringApplication.run(DicomApplication.class, args);

//		patientList.setPatients(new OuterReportFilter().filter(new PrecessOuterUtils().precessDicom(path)));


	}
}
