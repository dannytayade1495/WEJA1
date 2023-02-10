package com.jspiders.adapterpatttern.adapter;

import com.jspiders.adapterpatttern.interfaces.Events;
import com.jspiders.adapterpatttern.object.Employee;

public class EmpEventsAdapter extends Employee implements Events {

	@Override
	public void mothersDay() {
		
		EmpEventsAdapter employee1 = new EmpEventsAdapter();
		employee1.setEmp_id(1);
		employee1.setName("Aishwarya");
		System.out.println("Chief guest of the event is " 
				+ employee1.getName());
		
	}

	@Override
	public void fathersDay() {
		EmpEventsAdapter employee2 = new EmpEventsAdapter();
		employee2.setEmp_id(2);
		employee2.setName("Salman");
		System.out.println("Chief guest of the event is "
				+ employee2.getName());
	}
	
	public static void main(String[] args) {
		
		EmpEventsAdapter adapter = new EmpEventsAdapter();
		adapter.mothersDay();
		adapter.fathersDay();
		
	}

}
