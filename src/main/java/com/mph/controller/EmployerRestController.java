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
import com.mph.service.EmployerService;

@RestController
@RequestMapping("/employer")
@CrossOrigin(allowCredentials = "false",allowedHeaders =  "*"  ,origins = "http://localhost:4200",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE} )
public class EmployerRestController {
 
	@Autowired
	public EmployerService employerService;

	@GetMapping("/allemp")
	public ResponseEntity<List<Employer>> listAllEmployers() {
		List<Employer> li = employerService.getAllEmployer();
		if (li.isEmpty()) {
			return new ResponseEntity<List<Employer>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Employer>>(li,HttpStatus.OK);
	}
	
	@PostMapping("/createEmp")
	public Employer createEmployee(@RequestBody Employer employer) {
		employerService.createEmployer(employer);
		return employer;
	}
	
	@DeleteMapping("/deleteEmp/{id}")
	public ResponseEntity<List<Employer>> deleteEmployer(@PathVariable("id") int eid) {
		List<Employer> li = employerService.deleteEmployer(eid);
		if (li.isEmpty()) {
			return new ResponseEntity<List<Employer>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Employer>>(li,HttpStatus.OK);
	}
	
	@PutMapping("/updateEmp")
	public ResponseEntity<List<Employer>> updateEmployee(@RequestBody Employer employer) {
		List<Employer> li = employerService.updateEmployer(employer);
		
		if (li.isEmpty()) {
			return new ResponseEntity<List<Employer>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Employer>>(li,HttpStatus.OK);
	}
	
	@GetMapping("/getEmp/{email}")
    public ResponseEntity<Employer> getEmployee(@PathVariable("email") String email) {
        
        Employer employer = employerService.getEmployer(email);
    	if (employer == null) {
			return new ResponseEntity<Employer>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<Employer>(employer,HttpStatus.OK);
    }
	
	@GetMapping("/getEmpp/{username}")
    public ResponseEntity<Employer> getEmployer(@PathVariable("username") int username) {
        
        Employer employer = employerService.getEmployer(username);
    	if (employer == null) {
			return new ResponseEntity<Employer>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<Employer>(employer,HttpStatus.OK);
    }
	
}
