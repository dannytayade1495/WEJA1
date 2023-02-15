package com.jspiders.factorypattern.object;

import com.jspiders.factorypattern.beverage.Beverage;

public class GingerTea implements Beverage {

	@Override
	public void order() {
		System.out.println("Ordered Ginger Tea.");
	}

}
