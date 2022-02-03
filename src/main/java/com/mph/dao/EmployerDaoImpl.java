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
import com.mph.model.Jobseeker;

@Repository
public class EmployerDaoImpl implements EmployerDao {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void createEmployer(Employer employer) {
		getSession().saveOrUpdate(employer);
		System.out.println("Employer Saved successfully...");

	}

	@Override
	public List<Employer> getAllEmployer() {
		Query qry = getSession().createQuery("select e from Employer e");
		List<Employer> emplist = qry.list();
		System.out.println("emp list from dao : " + emplist);
		return emplist;
	}

	@Override
	public Employer getEmployer(Employer emp) {
		Criteria c = getSession().createCriteria(Employer.class);
		c.add(Restrictions.eq("email", emp.getEmail()));
		Employer empl = (Employer) c.uniqueResult();
		return empl;
	}

	@Override
	public List<Employer> updateEmployer(Employer employer) {
		Query qry = getSession()
				.createQuery(" update Employer  e set ename=:ename,email=:email,password=:pass,phone=:phone where eid=:eid");
		qry.setParameter("ename", employer.getEname());
		qry.setParameter("email", employer.getEmail());
		qry.setParameter("pass", employer.getPassword());
		qry.setParameter("phone", employer.getPhone());
		qry.setParameter("eid", employer.getEid());
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Updated " + noofrows + " rows. ");
		}
		return getAllEmployer();
	}

	@Override
	public List<Employer> deleteEmployer(int eid) {
		Query qry = getSession().createQuery(" delete Employer  e where eid=:eid");
		qry.setParameter("eid", eid);
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Deleted " + noofrows + " rows. ");
		}
		return getAllEmployer();
	}

	@Override
	public Employer getEmployer(String username) {
		System.out.println();
		System.out.println(username);
		System.out.println();
		
		Query qry = getSession().createQuery("from Employer js where js.ename=:username ");
		qry.setParameter("username", username);
		//System.out.println(qry.uniqueResult());
		//qry.setParameter("password", password);
		Employer js = (Employer) qry.uniqueResult();
		System.out.println("search result : " + js);
		return js;
	}
	
	@Override
	public Employer getEmployer(int eid) {
		Query qry = getSession().createQuery("from Employer js where js.eid=:eid ");
		qry.setParameter("eid", eid);
		//System.out.println(qry.uniqueResult());
		//qry.setParameter("password", password);
		Employer js = (Employer) qry.uniqueResult();
		System.out.println("search result : " + js);
		return js;
	}

	
}
