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

import com.mph.model.Jobseeker;
import com.mph.service.JobseekerService;

@RestController
@RequestMapping("/jobseeker")
@CrossOrigin(allowCredentials = "false",allowedHeaders =  "*"  ,origins = "http://localhost:4200",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE} )
public class JobseekerRestController {

	 @Autowired
	    public JobseekerService jobseekerservice;
	    @GetMapping("/allJs")
	    public ResponseEntity<List<Jobseeker>> listAllJobseeker() {
	        List<Jobseeker> li =jobseekerservice.getAllJobseeker();
	        if (li.isEmpty()) {
	            return new ResponseEntity<List<Jobseeker>>(HttpStatus.NO_CONTENT);
	        }
	        return new ResponseEntity<List<Jobseeker>>(li,HttpStatus.OK);
	    }
	    
	    @PostMapping("/createJs")
	    public Jobseeker createJobseeker(@RequestBody Jobseeker js) {
	        jobseekerservice.addJobseeker(js);
	        return js;
	    }
	    
	@DeleteMapping("/deleteJs/{id}")
	    public ResponseEntity<List<Jobseeker>> deleteJobseeker(@PathVariable("id") int jsid) {
	        List<Jobseeker> li = jobseekerservice.deleteJobseeker(jsid);
	        if (li.isEmpty()) {
	            return new ResponseEntity<List<Jobseeker>>(HttpStatus.NO_CONTENT);
	        }
	        return new ResponseEntity<List<Jobseeker>>(li,HttpStatus.OK);
	    }
	    
	    @PutMapping("/updateJobseeker")
	    public ResponseEntity<List<Jobseeker>> updateJobseeker(@RequestBody Jobseeker js) {
	        List<Jobseeker> li = jobseekerservice.updateJobseeker(js);
	        
	        if (li.isEmpty()) {
	            return new ResponseEntity<List<Jobseeker>>(HttpStatus.NO_CONTENT);
	        }
	        return new ResponseEntity<List<Jobseeker>>(li,HttpStatus.OK);
	    }

	@GetMapping("/getJobseeker/{username}")
	    public ResponseEntity<Jobseeker> getJobseeker(@PathVariable("username") String username) {
	        
	        Jobseeker js = jobseekerservice.getJobseeker(username);
	        if (js == null) {
	            return new ResponseEntity<Jobseeker>(HttpStatus.NO_CONTENT);
	        }
	        return new ResponseEntity<Jobseeker>(js,HttpStatus.OK);
	    }
	
	@GetMapping("/getJs")
    public ResponseEntity<List<Jobseeker>> listJobseeker() {
        List<Jobseeker> li =jobseekerservice.getJobseeker();
        if (li.isEmpty()) {
            return new ResponseEntity<List<Jobseeker>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Jobseeker>>(li,HttpStatus.OK);
    }
    
	
}
