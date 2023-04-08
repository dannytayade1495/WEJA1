package com.jspiders.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.springboot.pojo.EmployeePOJO;
import com.jspiders.springboot.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;

	public EmployeePOJO addEmployee(EmployeePOJO employee) {
		EmployeePOJO pojo = repository.save(employee);
		return pojo;
	}
	

}
