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
import com.mph.model.JobsModel;

import com.mph.service.JobsService;

@RestController
@RequestMapping("/jobs")
@CrossOrigin(allowCredentials = "false",allowedHeaders =  "*"  ,origins = "http://localhost:4200",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE} )
public class JobsRestController {
    @Autowired
    public JobsService jobsservice;
    @GetMapping("/allJs")
    public ResponseEntity<List<JobsModel>> listAllJobs() {
        List<JobsModel> li =jobsservice.getAllJobs();
        if (li.isEmpty()) {
            return new ResponseEntity<List<JobsModel>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<JobsModel>>(li,HttpStatus.OK);
    }
    
    @PostMapping("/createJs")
    public JobsModel createJobs(@RequestBody JobsModel jobs) {
        jobsservice.addJobs(jobs);
        return jobs;
    }
    @DeleteMapping("/deleteJs/{id}")
    public ResponseEntity<List<JobsModel>> deleteJobs(@PathVariable("id") int jobid) {
        List<JobsModel> li = jobsservice.deleteJobs(jobid);
        if (li.isEmpty()) {
            return new ResponseEntity<List<JobsModel>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<JobsModel>>(li,HttpStatus.OK);
    }
    
    @PutMapping("/updateJobs")
    public ResponseEntity<List<JobsModel>> updateJobs(@RequestBody JobsModel jobs) {
        List<JobsModel> li = jobsservice.updateJobs(jobs);
        
        if (li.isEmpty()) {
            return new ResponseEntity<List<JobsModel>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<JobsModel>>(li,HttpStatus.OK);
    }
    @GetMapping("/getJobs/{jobid}")
    public ResponseEntity<JobsModel> getJobs(@PathVariable("jobid") int id) {
        
    	JobsModel jobs = jobsservice.getJobs(id);
        if (jobs == null) {
            return new ResponseEntity<JobsModel>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<JobsModel>(jobs,HttpStatus.OK);
    }
    
    
   
}
    
    

