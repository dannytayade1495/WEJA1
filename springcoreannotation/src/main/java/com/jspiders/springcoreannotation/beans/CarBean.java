package com.jspiders.springcoreannotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class CarBean {
	
	@Value("1")
	private int id;
	@Value("Mahindra")
	private String brand;
	@Value("XUV")
	private String model;
	@Value("MH12AB1234")
	private String regno;
	@Autowired
	private DriverBean driver;

}
