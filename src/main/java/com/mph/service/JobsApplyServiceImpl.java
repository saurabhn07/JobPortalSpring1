package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.EmployerDao;
import com.mph.dao.JobsApplyDao;
import com.mph.model.Employer;
import com.mph.model.JobApply;

@Service
@Transactional
public class JobsApplyServiceImpl implements JobsApplyService{

	@Autowired
	public JobsApplyDao jobsapplydao;
	
	
	@Override
	public void addJobseeker(JobApply jobapply) {
		jobsapplydao.addJobseeker(jobapply);
		
	}


}
