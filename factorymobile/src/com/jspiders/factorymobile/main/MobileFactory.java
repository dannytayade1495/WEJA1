package com.jspiders.factorymobile.main;

import java.util.Scanner;

import com.jspiders.factorymobile.mobile.Mobile;
import com.jspiders.factorymobile.object.Nothing1;
import com.jspiders.factorymobile.object.OnePlus11Pro;
import com.jspiders.factorymobile.object.Pixel7Pro;
import com.jspiders.factorymobile.object.SamsungS23;

public class MobileFactory {

	static Mobile mobile;

	public static void main(String[] args) {
		try {
			factory().order();
		} catch (NullPointerException e) {
			System.out.println("No mobile selected.");
		}
	}

	private static Mobile factory() {
		System.out.println("Select Mobile To Order");
		System.out.println("1. Samsung S23\n" + "2. Pixel 7 Pro\n" + "3. OnePlus 11 Pro\n" + "4. Nothing1");

		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();

		switch (choice) {
		case 1:
			mobile = new SamsungS23();
			return mobile;

		case 2:
			mobile = new Pixel7Pro();
			return mobile;

		case 3:
			mobile = new OnePlus11Pro();
			return mobile;

		case 4:
			mobile = new Nothing1();
			return mobile;
			
		default:
			System.out.println("Invalid choice.");
			return mobile;
		}
	}

}
