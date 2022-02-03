package com.mph.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.JobseekerDao;
	import com.mph.model.Jobseeker;
	
	@Service
	@Transactional
	public class JobseekerServiceImpl implements JobseekerService{
	    @Autowired
	    private JobseekerDao jobseekerDao;
	    @Override
	    public void addJobseeker(Jobseeker js) {   
	    	jobseekerDao.addJobseeker(js);
	    }
	    @Override
	    public List<Jobseeker> getAllJobseeker() {
	        // TODO Auto-generated method stub
	        return jobseekerDao.getAllJobseeker();
	    }
	    @Override
	    public List<Jobseeker> deleteJobseeker(int jsid) {
	        // TODO Auto-generated method stub
	        return jobseekerDao.deleteJobseeker(jsid);
	    }
	    @Override
	    public Jobseeker getJobseeker(String username) {
	        // TODO Auto-generated method stub
	        return jobseekerDao.getJobseeker(username);
	    }
	    @Override
	    public List<Jobseeker> updateJobseeker(Jobseeker js) {
	        // TODO Auto-generated method stub
	        return jobseekerDao.updateJobseeker(js);
	    }
		@Override
		public List<Jobseeker> getJobseeker() {
			
			return jobseekerDao.getJobseeker();
		}
	}
	

