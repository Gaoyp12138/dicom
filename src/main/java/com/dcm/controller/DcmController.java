package com.dcm.controller;

import com.dcm.domin.packaging.AllStudy;
import com.dcm.service.DcmService;
import com.dcm.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Created by Eric
 * @Date: 2017/11/7
 * @Description:
 */
@RestController
@RequestMapping(value = "/dcm")
public class DcmController {

	@Autowired
	private DcmService dcmService;

	@RequestMapping(value = "/operate",method = RequestMethod.GET)
	public Result findAll(){

		AllStudy all = dcmService.findAll();
		if (!all.toString().isEmpty()){
			return new Result(true,all);
		}else {
			return new Result(false,"查询失败，请稍后再试");
		}

	}


	@RequestMapping(value = "/{studyInstanceUID}/operate",method = RequestMethod.GET)
	public Result findDcmByStudyInstanceUID(@PathVariable String studyInstanceUID){
		AllStudy all = dcmService.findDcmByStudyInstanceUID(studyInstanceUID);
		if (all != null){
			return new Result(true,all);
		}else {
			return new Result(false,"查询失败，请稍后再试");
		}
	}

}
