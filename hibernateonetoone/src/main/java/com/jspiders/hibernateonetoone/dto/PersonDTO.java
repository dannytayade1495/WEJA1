package com.jspiders.hibernateonetoone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class PersonDTO {
	
	@Id
	private int id;
	private String name;
	private String city;
	private long contact;
	@OneToOne
	private AadharDTO aadhar;

}
