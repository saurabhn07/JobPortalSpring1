package com.mph.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.model.JobsModel;


@Repository
public class JobsDaoImpl implements JobsDao {
    @Autowired
    private SessionFactory sessionFactory;
    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    @Override
    public void addJobs(JobsModel jobs) {
        getSession().saveOrUpdate(jobs);
        System.out.println("Employee Saved successfully...");
        
        
    }
    @Override
    public List<JobsModel> getAllJobs() {
        Query qry = getSession().createQuery("select job from JobsModel job");
        List<JobsModel> jobslist = qry.list();
        System.out.println("jobs list from dao : " + jobslist);
        return jobslist;
    }
    @Override
    public List<JobsModel> updateJobs(JobsModel jobs) {
        Query qry = getSession()
                .createQuery(" update JobsModel  job set jobname=:jobname,jobLocation=:jobLocation,experiance=:experiance,educationDetails=:educationDetails,phone=:phone,address=:address where jobid=:jobid");
        qry.setParameter("jobname", jobs.getJobname());
        qry.setParameter("jobLocation", jobs.getJobLocation());
        qry.setParameter("experiance", jobs.getExperiance());
        qry.setParameter("educationDetails", jobs.getEducationDetails());
        qry.setParameter("phone", jobs.getPhone());
        qry.setParameter("address", jobs.getAddress());
        //qry.setParameter("CTC", jobs.getCTC());
        qry.setParameter("jobid", jobs.getJobid());
        int noofrows = qry.executeUpdate();
        if (noofrows > 0) {
            System.out.println("Updated " + noofrows + " rows. ");
        }
        return getAllJobs();
    }
    public List<JobsModel> deleteJobs(int jobid) {
        Query qry = getSession().createQuery(" delete JobsModel  job where jobid=:jobid");
        qry.setParameter("jobid", jobid);
        int noofrows = qry.executeUpdate();
        if (noofrows > 0) {
            System.out.println("Deleted " + noofrows + " rows. ");
        }
        return getAllJobs();
    }
    @Override
    public JobsModel getJobs(int id) {
        Query qry = getSession().createQuery("from JobsModel job where jobid=:id");
        qry.setParameter("id", id);
        JobsModel jobs = (JobsModel) qry.uniqueResult();
        System.out.println("search result : " + jobs);
        return jobs;
    }

	}
	