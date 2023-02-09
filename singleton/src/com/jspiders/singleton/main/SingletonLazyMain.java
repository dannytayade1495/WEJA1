package com.jspiders.singleton.main;

import com.jspiders.singleton.object.SingletonLazy;

public class SingletonLazyMain {
	
	public static void main(String[] args) {
		
		SingletonLazy object1 = SingletonLazy.getObject();
		SingletonLazy object2 = SingletonLazy.getObject();
		SingletonLazy object3 = SingletonLazy.getObject();
		
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object3);
		
	}

}
