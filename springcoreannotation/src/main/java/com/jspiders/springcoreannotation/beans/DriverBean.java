package com.jspiders.springcoreannotation.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class DriverBean {
	
	@Value("1")
	private int id;
	@Value("Karan")
	private String name;
	@Value("8756941230")
	private long contact;

}
