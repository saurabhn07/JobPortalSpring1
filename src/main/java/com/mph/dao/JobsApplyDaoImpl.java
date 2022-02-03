package com.mph.dao;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LikeExpression;
import org.hibernate.criterion.MatchMode;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.model.Employer;
import com.mph.model.JobApply;
import com.mph.model.Jobseeker;

@Repository
public class JobsApplyDaoImpl implements JobsApplyDao {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void addJobseeker(JobApply jobapply) {
		getSession().saveOrUpdate(jobapply);
		System.out.println("Employer Saved successfully...");

	}


	
}
