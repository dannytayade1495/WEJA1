package com.jspiders.springcorexml.beans;

import lombok.Data;

@Data
public class CarBean {
	
	private int id;
	private String brand;
	private String model;
	private String regno;
	private DriverBean driver;

}
