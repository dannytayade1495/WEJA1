package com.jspiders.springboot.response;

import java.util.List;

import com.jspiders.springboot.pojo.EmployeePOJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {
	
	private String status;
	private String msg;
	private EmployeePOJO data;
	private List<EmployeePOJO> list;

}
