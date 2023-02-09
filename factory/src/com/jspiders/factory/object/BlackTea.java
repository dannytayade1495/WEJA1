package com.jspiders.factory.object;

import com.jspiders.factory.beverage.Beverage;

public class BlackTea implements Beverage {

	@Override
	public void order() {
		System.out.println("Ordered Black Tea.");
	}

}
