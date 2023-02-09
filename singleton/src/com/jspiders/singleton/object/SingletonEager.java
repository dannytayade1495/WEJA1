package com.jspiders.singleton.object;

public class SingletonEager {
	
	static SingletonEager object = new SingletonEager();
	
	private SingletonEager() {
		System.out.println("Constructor accessed.");
	}
	
	public static SingletonEager getObject() {
		System.out.println("Method accessed.");
		return object;
	}

}
