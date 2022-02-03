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
 * @author Pradip
 *
 */
@Entity
public class Jobseeker {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int jsid;
	private String jsname;
	private String educationDetails;
	private String location;
	private String experiance;
	private long phone;
	private String password;
	private String email;
   
	public Jobseeker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jobseeker(int jsid, String jsname, String educationDetails, String location, String experiance, long phone,
			 String password,String email) {
		super();
		this.jsid = jsid;
		this.jsname = jsname;
		this.educationDetails = educationDetails;
		this.location = location;
		this.experiance = experiance;
		this.phone = phone;
		this.password = password;
		this.email = email;
	}
      /**
       * 
       * @return jobseeker email
       */
	public String getEmail() {
		return email;
	}
       /**
        * 
        * @param email accepts jobseeker email
        */
	public void setEmail(String email) {
		this.email = email;
	}
      /**
       * 
       * @return jobseeker id
       */
	public int getJsid() {
		return jsid;
	}
         /**
          * 
          * @param jsid accepts jobseeker id
          */
	public void setJsid(int jsid) {
		this.jsid = jsid;
	}
             /**
              * 
              * @return jobseeker name
              */
	public String getJsname() {
		return jsname;
	}
           /**
            * 
            * @param jsname accepts jobseeker name
            */
	public void setJsname(String jsname) {
		this.jsname = jsname;
	}
       /**
        * 
        * @return jobseeker education details
        */
	public String getEducationDetails() {
		return educationDetails;
	}
      /**
       * 
       * @param educationDetails accepts jobseeker education details
       */
	public void setEducationDetails(String educationDetails) {
		this.educationDetails = educationDetails;
	}
      
	/**
	 * 
	 * @return jobseeker location
	 */
	public String getLocation() {
		return location;
	}
      /**
       * 
       * @param location accepts jobseeker location
       */
	public void setLocation(String location) {
		this.location = location;
	}
         /**
          * 
          * @return jobseeker experiance
          */
	public String getExperiance() {
		return experiance;
	}
           /**
            * 
            * @param experiance accepts jobseeker experiance
            */
	public void setExperiance(String experiance) {
		this.experiance = experiance;
	}
           /**
            * 
            * @return jobseeker phone
            */
	public long getPhone() {
		return phone;
	}
         /**
          * 
          * @param phone accepts jobseeker phone 
          */
	public void setPhone(long phone) {
		this.phone = phone;
	}
           /**
            * 
            * @return jobseeker password 
            */
	public String getPassword() {
		return password;
	}  
	    /**
	     * 
	     * @param password accepts jobseeker password 
	     */

	public void setPassword(String password) {
		this.password = password;
	}
	

	@Override
	public String toString() {
		return "Jobseeker [jsid=" + jsid + ", jsname=" + jsname + ", educationDetails=" + educationDetails
				+ ", location=" + location + ", experiance=" + experiance + ", phone=" + phone + ", password="
				+ password + ", email=" + email + "]";
	}

	
}
