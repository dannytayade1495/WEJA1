package com.jspiders.factory.object;

import com.jspiders.factory.beverage.Beverage;

public class MasalaTea implements Beverage {

	@Override
	public void order() {
		System.out.println("Ordered Masala Tea.");
	}

}
