package com.jspiders.hibernateonetomany.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernateonetomany.dto.CompanyDTO;
import com.jspiders.hibernateonetomany.dto.EmployeeDTO;

public class CompEmpDAO {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("OneToMany");
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
			
			EmployeeDTO employee1 = new EmployeeDTO();
			employee1.setId(1);
			employee1.setName("Raju");
			employee1.setEmail("raju@paisadouble.com");
			employee1.setDesignation("Schemer");
			employee1.setSalary(150);
			manager.persist(employee1);
			
			EmployeeDTO employee2 = new EmployeeDTO();
			employee2.setId(2);
			employee2.setName("Babu Bhaiya");
			employee2.setEmail("babubhaiya@garrage.com");
			employee2.setDesignation("Owner");
			employee2.setSalary(150);
			manager.persist(employee2);
			
			List<EmployeeDTO> employees = 
					Arrays.asList(employee1, employee2);
			
			CompanyDTO company1 = new CompanyDTO();
			company1.setId(1);
			company1.setName("Hera Pheri");
			company1.setCity("Dange Chowk");
			company1.setEmployees(employees);
			manager.persist(company1);
			
			transaction.commit();
			
		} finally {
			closeConnection();
		}
	}
}
