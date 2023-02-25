package com.jspiders.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dto.EmployeeDTO;

public class EmployeeDAO {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("emp");
		
		EntityManager entityManager = 
				entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = 
				entityManager.getTransaction();
		
		entityTransaction.begin();
		
		EmployeeDTO employee1 = new EmployeeDTO();
		employee1.setId(1);
		employee1.setName("Champak Chacha");
		employee1.setEmail("champakchacha@gmail.com");
		employee1.setContact(9875641231L);
		
		entityManager.persist(employee1);
		
		entityTransaction.commit();
		
		entityManagerFactory.close();
		entityManager.close();
		if (entityTransaction.isActive()) {
			entityTransaction.rollback();
		}

	}

}
