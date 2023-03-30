package com.jspiders.springcoreannotation.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeBean {
	
	private int id;
	private String name;
	private String email;

}
