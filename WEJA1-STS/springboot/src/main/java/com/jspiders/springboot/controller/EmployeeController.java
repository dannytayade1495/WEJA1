package com.jspiders.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.springboot.pojo.EmployeePOJO;
import com.jspiders.springboot.response.EmployeeResponse;
import com.jspiders.springboot.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/add")
	public ResponseEntity<EmployeeResponse> addEmployee(@RequestBody EmployeePOJO employee){
		EmployeePOJO pojo = service.addEmployee(employee);
		if (pojo != null) {
			//Success
			return new ResponseEntity<EmployeeResponse>(new EmployeeResponse("OK", "Employee data added. ", pojo, null), HttpStatus.ACCEPTED);
		}
		//Failure
		return new ResponseEntity<EmployeeResponse>(new EmployeeResponse("FAIL", "Employee data not added. ", null, null), HttpStatus.BAD_REQUEST);
	}

}
