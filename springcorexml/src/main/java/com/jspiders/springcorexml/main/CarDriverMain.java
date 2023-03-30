package com.jspiders.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcorexml.beans.CarBean;

public class CarDriverMain {
	
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext
										("CarDriverConfig.xml");
		CarBean car = context.getBean(CarBean.class);
		System.out.println(car);
		((ClassPathXmlApplicationContext)context).close();
	}

}
