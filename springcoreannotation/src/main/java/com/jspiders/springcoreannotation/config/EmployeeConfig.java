package com.jspiders.springcoreannotation.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.springcoreannotation.beans.EmployeeBean;

public class EmployeeConfig {
	
	@Bean("emp1")
	public EmployeeBean getEmployee() {
		EmployeeBean emp1 = new EmployeeBean();
		emp1.setId(1);
		emp1.setName("Pankaj");
		emp1.setEmail("pankaj@gmail.com");
		return emp1;
	}
	
	@Bean("emp2")
	public EmployeeBean getEmployee2() {
		EmployeeBean emp2 = new EmployeeBean
					(2, "Pooja", "pooja@gmail.com");
		return emp2;
	}

}
