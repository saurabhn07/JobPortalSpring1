package com.mph.service;

import java.util.List;

import com.mph.model.JobsModel;

public interface JobsService {
    public void addJobs(JobsModel jobs);
    public List<JobsModel> getAllJobs();
    //public JObs getAEmployee();
    public List<JobsModel> updateJobs(JobsModel jobs);
    public List<JobsModel> deleteJobs(int id);
    public JobsModel getJobs(int id);
    
}
