package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.EmployerDao;
import com.mph.model.Employer;

@Service
@Transactional
public class EmployerServiceImpl implements EmployerService{

	@Autowired
	public EmployerDao employerDao;
	
	
	@Override
	public void createEmployer(Employer employer) {
		employerDao.createEmployer(employer);
		
	}

	@Override
	public List<Employer> getAllEmployer() {
		return employerDao.getAllEmployer();
	}

	@Override
	public Employer getEmployer(Employer emp) {
		
		return employerDao.getEmployer(emp);
	}

	@Override
	public List<Employer> updateEmployer(Employer employer) {
		
		return employerDao.updateEmployer(employer);
	}

	@Override
	public List<Employer> deleteEmployer(int eid) {
	
		return employerDao.deleteEmployer(eid);
	}

	@Override
	public  Employer getEmployer(String username) {
		
		return employerDao.getEmployer(username);
	}
	
	@Override
	public  Employer getEmployer(int eid) {
		
		return employerDao.getEmployer(eid);
	}
	
}
