package com.mph.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mph.model.Jobseeker;

@Repository
public class JobseekerDaoImpl implements JobseekerDao {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void addJobseeker(Jobseeker js) {
		getSession().saveOrUpdate(js);
		System.out.println("Jobseeker added successfully...");
	}

	@Override
	public List<Jobseeker> getAllJobseeker() {
		Query qry = getSession().createQuery(" from Jobseeker js");
		List<Jobseeker> jslist = qry.list();
		System.out.println("js list from dao : " + jslist);
		return jslist;
	}

	@Override
	public List<Jobseeker> updateJobseeker(Jobseeker js) {
		Query qry = getSession().createQuery(
				" update Jobseeker  js set jsname=:jsname,Location=:Location,experiance=:experiance,phone=:phone,password=:password,educationDetails=:educationDetails,email=:email where jsid=:jsid");
		qry.setParameter("jsname", js.getJsname());
		qry.setParameter("Location", js.getLocation());
		qry.setParameter("experiance", js.getExperiance());
		qry.setParameter("phone", js.getPhone());
		qry.setParameter("password", js.getPassword());
		qry.setParameter("educationDetails", js.getEducationDetails());
		qry.setParameter("email", js.getEmail());
		qry.setParameter("jsid", js.getJsid());
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Updated " + noofrows + " rows. ");
		}
		return getAllJobseeker();
	}

	@Override
	public List<Jobseeker> deleteJobseeker(int jsid) {
		Query qry = getSession().createQuery(" delete Jobseeker  js where jsid=:jseid");
		qry.setParameter("jseid", jsid);
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Deleted " + noofrows + " rows. ");
		}
		return getAllJobseeker();
	}

	@Override
	public Jobseeker getJobseeker(String username) {
		System.out.println();
		System.out.println(username);
		System.out.println();
		Query qry = getSession().createQuery("from Jobseeker js where js.jsname=:username ");
		qry.setParameter("username", username);
		//qry.setParameter("password", password);
		Jobseeker js = (Jobseeker) qry.uniqueResult();
		System.out.println("search result : " + js);
		return js;
	}

	@Override
	public List<Jobseeker> getJobseeker() {
		Query qry = getSession().createQuery("select js.email,js.password from Jobseeker js");
		List<Jobseeker> jslist = qry.list();
		List<String>jlist = null ;
		// for(  : jlist) {
	           // System.out.println(jss.getPassword());
	       // }
	           /* List<String> strings = new ArrayList<>(jslist.size());
	            for (Jobseeker object : jslist) {
	            	 strings.add(Objects.toString(object, null));
	            }
	            
	         
	            
	            System.out.println(jlist);*/
	    
	   /* List<String> strings = jslist.stream()
	    .map(jslist-> Objects.toString(jslist, null))
	      .collect(Collectors.toList());  */      
	            
	            
		System.out.println("js list from dao : " + jslist);
		return jslist;
	
	}
}