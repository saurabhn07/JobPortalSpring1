package com.mph.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class JobApply {
    @Id
	private int jobid;
	private int jsid;
	private String jobname;
	public JobApply() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JobApply(int jobid, int jsid, String jobname) {
		super();
		this.jobid = jobid;
		this.jsid = jsid;
		this.jobname = jobname;
	}
	public int getJobid() {
		return jobid;
	}
	public void setJobid(int jobid) {
		this.jobid = jobid;
	}
	public int getJsid() {
		return jsid;
	}
	public void setJsid(int jsid) {
		this.jsid = jsid;
	}
	public String getJobname() {
		return jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	@Override
	public String toString() {
		return "JobApply [jobid=" + jobid + ", jsid=" + jsid + ", jobname=" + jobname + "]";
	}
	
	
}
