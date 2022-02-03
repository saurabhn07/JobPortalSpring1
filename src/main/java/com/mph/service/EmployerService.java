package com.mph.service;

import java.util.List;

import com.mph.model.Employer;

public interface EmployerService {

	public void createEmployer(Employer employer);
	public List<Employer> getAllEmployer();
	public Employer getEmployer(Employer emp);
	public List<Employer> updateEmployer(Employer employer);
	public List<Employer> deleteEmployer(int eid);
	public Employer getEmployer(String username);
	public Employer getEmployer(int eid);
	
}
