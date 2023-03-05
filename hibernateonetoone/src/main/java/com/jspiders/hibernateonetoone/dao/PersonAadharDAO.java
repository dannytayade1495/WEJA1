package com.jspiders.hibernateonetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernateonetoone.dto.AadharDTO;
import com.jspiders.hibernateonetoone.dto.PersonDTO;

public class PersonAadharDAO {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("aadhar");
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
			
			PersonDTO person = new PersonDTO();
			person.setId(1);
			person.setName("Avinash");
			person.setCity("Banglore");
			person.setContact(9576841230L);
			
			AadharDTO aadhar = new AadharDTO();
			aadhar.setId(1);
			aadhar.setAadhar_no(123456789012L);
			aadhar.setDate_of_issue("15-Nov-2020");
			
			aadhar.setPerson(person);
			person.setAadhar(aadhar);
			
			manager.persist(person);
			manager.persist(aadhar);
			
			transaction.commit();
			
		} finally {
			closeConnection();
		}
	}
}
