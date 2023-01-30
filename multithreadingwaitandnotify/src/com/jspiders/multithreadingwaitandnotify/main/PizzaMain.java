package com.jspiders.multithreadingwaitandnotify.main;

import com.jspiders.multithreadingwaitandnotify.resourse.Pizza;
import com.jspiders.multithreadingwaitandnotify.thread.Dominos;
import com.jspiders.multithreadingwaitandnotify.thread.Friends;

public class PizzaMain {

	public static void main(String[] args) {

		Pizza pizza = new Pizza();

		Friends friends1 = new Friends(pizza);
		Friends friends2 = new Friends(pizza);
		Dominos dominos = new Dominos(pizza);

		friends1.start();
		friends2.start();
		dominos.start();

	}

}
