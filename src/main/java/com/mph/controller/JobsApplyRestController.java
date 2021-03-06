package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.mph.model.Employer;
import com.mph.model.JobApply;
import com.mph.service.JobsApplyService;

@RestController
@RequestMapping("/jobapply")
@CrossOrigin(allowCredentials = "false",allowedHeaders =  "*"  ,origins = "http://localhost:4200",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE} )
public class JobsApplyRestController {
 
	@Autowired
	public JobsApplyService jobapplyservice;

	
	
	@PostMapping("/addjobseeker")
	public JobApply addJobseeker(@RequestBody JobApply jobapply) {
		jobapplyservice.addJobseeker(jobapply);
		return jobapply;
	}
	
	
	
	
	
	
	
	
}
