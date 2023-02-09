package com.jspiders.factory.main;

import java.util.Scanner;

import com.jspiders.factory.beverage.Beverage;
import com.jspiders.factory.object.BlackTea;
import com.jspiders.factory.object.GingerTea;
import com.jspiders.factory.object.MasalaTea;
import com.jspiders.factory.object.Tea;

public class TeaFactory {

	static Beverage beverage;

	public static void main(String[] args) {

		try {
			factory().order();
		} catch (NullPointerException e) {
			System.out.println("No tea selected.");
		}
	}

	private static Beverage factory() {
		System.out.println("Select Tea to order");
		System.out.println("1. Tea\n" 
						+ "2. Black Tea\n" 
						+ "3. Ginger Tea\n" 
						+ "4. Masala Tea");

		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();

		switch (choice) {
		case 1:
			beverage = new Tea();
			return beverage;

		case 2:
			beverage = new BlackTea();
			return beverage;

		case 3:
			beverage = new GingerTea();
			return beverage;

		case 4:
			beverage = new MasalaTea();
			return beverage;

		default:
			System.out.println("Invalid choice.");
			return beverage;
		}
		
	}

}
