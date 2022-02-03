package com.mph.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * 
 * @author Saurabh Nare
 *
 */
@Entity
public class Employer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String ename;
	private String email;
	private String password;
	private long phone;
	public Employer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employer(int eid, String ename, String email, String password, long phone) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}
	/**
	 * 
	 * @return Employer id 
	 */
	public int getEid() {
		return eid;
		
	}
	/**
	 * 
	 * @param eid accepts employer id
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}
	/**
	 * 
	 * @return String returns String which is employer 
	 */
	public String getEname() {
		return ename;
	}
	/**
	 * 
	 * @param ename accepts String ename
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}
	/**
	 * 
	 * @return email returns employer email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 
	 * @param email accepts employer email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 
	 * @return employer password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 
	 * @param password accepts  employer password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 
	 * @return employer phone
	 */
	public long getPhone() {
		return phone;
	}
	/**
	 * 
	 * @param phone accepts employer phone
	 */
	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employer [eid=" + eid + ", ename=" + ename + ", email=" + email + ", password=" + password + ", phone="
				+ phone + "]";
	}
  
	
	
}
