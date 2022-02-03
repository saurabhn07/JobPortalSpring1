package com.mph.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.JobsDao;
import com.mph.model.JobsModel;
@Service
@Transactional
public class JobsServiceImpl implements JobsService{
    @Autowired
    private JobsDao jobsDao;
    
    @Override
    public void addJobs(JobsModel jobs) {
         jobsDao.addJobs(jobs);
    }
    @Override
    public List<JobsModel> getAllJobs() {
        return jobsDao.getAllJobs();
    }
    @Override
    public List<JobsModel> updateJobs(JobsModel jobs) {
        return jobsDao.updateJobs(jobs);
        
    }
    @Override
    public List<JobsModel> deleteJobs(int id) {
        return jobsDao.deleteJobs(id);
        
    }
    @Override
    public JobsModel getJobs(int id) {
        return jobsDao.getJobs(id);
    }
}
