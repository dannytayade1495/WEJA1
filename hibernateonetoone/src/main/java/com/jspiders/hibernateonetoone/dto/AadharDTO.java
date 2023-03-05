package com.jspiders.hibernateonetoone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class AadharDTO {
	
	@Id
	private int id;
	private long aadhar_no;
	private String date_of_issue;
	@OneToOne
	private PersonDTO person;

}
