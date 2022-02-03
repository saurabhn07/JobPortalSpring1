package com.mph.service;

import java.util.List;

import com.mph.model.Jobseeker;

public interface JobseekerService {

	 void addJobseeker(Jobseeker js);
	    List<Jobseeker> getAllJobseeker();
	    List<Jobseeker> deleteJobseeker(int jsid);
	    Jobseeker getJobseeker(String username);
	    List<Jobseeker> updateJobseeker(Jobseeker js);
		List<Jobseeker> getJobseeker();
	
}
