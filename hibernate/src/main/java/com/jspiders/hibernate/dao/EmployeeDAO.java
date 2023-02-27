package com.jspiders.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dto.EmployeeDTO;

public class EmployeeDAO {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	private static void openConnection() {
		entityManagerFactory = 
				Persistence.createEntityManagerFactory("emp");

		entityManager = entityManagerFactory.createEntityManager();

		entityTransaction = entityManager.getTransaction();
	}
	
	private static void closeConnection() {
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		if (entityManager != null) {
			entityManager.close();
		}
		if (entityTransaction.isActive()) {
			entityTransaction.rollback();
		}
	}

	public static void main(String[] args) {

		try {
			openConnection();

			entityTransaction.begin();

			EmployeeDTO employee1 = new EmployeeDTO();
			employee1.setId(4);
			employee1.setName("Komal");
			employee1.setEmail("komal@gmail.com");
			employee1.setContact(9875641531L);

			entityManager.persist(employee1);

			entityTransaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
	}
}
