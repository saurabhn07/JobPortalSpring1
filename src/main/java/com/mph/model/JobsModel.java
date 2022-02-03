package com.mph.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
/**
 * 
 * @author Pavani
 *
 */
@Entity
public class JobsModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int jobid;
	private String jobname;
	private String educationDetails;
	private String jobLocation;
	private String experiance;
	private long phone;
	private String address;
	
	public JobsModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public JobsModel(int jobid, String jobname, String educationDetails, String jobLocation, String experiance, long phone,
			String address) {
		super();
		this.jobid = jobid;
		this.jobname = jobname;
		this.educationDetails = educationDetails;
		this.jobLocation = jobLocation;
		this.experiance = experiance;
		this.phone = phone;
		this.address = address;
	}
	/**
	 * 
	 * @return jobid
	 */
	public int getJobid() {
		return jobid;
	}
	/**
	 * 
	 * @param jobid accepts jobid 
	 */
	public void setJobid(int jobid) {
		this.jobid = jobid;
	}
	/**
	 * 
	 * @return jobname
	 */
	public String getJobname() {
		return jobname;
	}
	/**
	 * 
	 * @param jobname accepts jobname
	 */
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	/**
	 * 
	 * @return education details
	 */
	public String getEducationDetails() {
		return educationDetails;
	}
	/**
	 * 
	 * @param educationDetails accepts education details
	 */
	public void setEducationDetails(String educationDetails) {
		this.educationDetails = educationDetails;
	}
	/**
	 * 
	 * @return job location
	 */
	public String getJobLocation() {
		return jobLocation;
	}
	/**
	 * 
	 * @param jobLocation accepts job location
	 */
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	/**
	 * 
	 * @return experiance
	 */
	public String getExperiance() {
		return experiance;
	}
	/**
	 * 
	 * @param experiance accepts experiance
	 */
	public void setExperiance(String experiance) {
		this.experiance = experiance;
	}
	/**
	 * 
	 * @return phone
	 */
	public long getPhone() {
		return phone;
	}
	/**
	 * 
	 * @param phone accepts phone
	 */
	public void setPhone(long phone) {
		this.phone = phone;
	}
	/**
	 * 
	 * @return address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Jobs [jobid=" + jobid + ", jobname=" + jobname + ", educationDetails=" + educationDetails
				+ ", jobLocation=" + jobLocation + ", experiance=" + experiance + ", phone=" + phone + ", address="
				+ address + "]";
	}
	
	
	
}
