package com.mph.dao;
import java.util.List;

import com.mph.model.JobsModel;

public interface JobsDao {
    public void addJobs(JobsModel jobs);
    public List<JobsModel> getAllJobs();
    public List<JobsModel> updateJobs(JobsModel jobs);
    public List<JobsModel> deleteJobs(int id);
    public JobsModel getJobs(int id);
    
    
}

