package com.jspiders.hibernatemanytoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernatemanytoone.dto.PassengerDTO;
import com.jspiders.hibernatemanytoone.dto.TrainDTO;

public class PassTrainDAO {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("ManyToOne");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}
	
	private static void closeConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		if (transaction.isActive()) {
			transaction.rollback();
		}
	}
	
	public static void main(String[] args) {
		try {
			
			openConnection();
			
			transaction.begin();
			
			TrainDTO train = new TrainDTO();
			train.setId(1);
			train.setName("Chennai Express");
			train.setTrain_no(12345);
			manager.persist(train);
			
			PassengerDTO passenger1 = new PassengerDTO();
			passenger1.setId(1);
			passenger1.setName("Minamma");
			passenger1.setAge(25);
			passenger1.setSeat_no(10);
			passenger1.setTrain(train);
			manager.persist(passenger1);
			
			PassengerDTO passenger2 = new PassengerDTO();
			passenger2.setId(2);
			passenger2.setName("Thangabali");
			passenger2.setAge(30);
			passenger2.setSeat_no(20);
			passenger2.setTrain(train);
			manager.persist(passenger2);
			
			transaction.commit();
			
		} finally {
			closeConnection();
		}
	}
}
