package com.jspiders.factorypattern.object;

import com.jspiders.factorypattern.beverage.Beverage;

public class BlackTea implements Beverage {

	@Override
	public void order() {
		System.out.println("Ordered Black Tea.");
	}

}
