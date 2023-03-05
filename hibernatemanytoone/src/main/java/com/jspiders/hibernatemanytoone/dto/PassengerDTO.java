package com.jspiders.hibernatemanytoone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class PassengerDTO {
	
	@Id
	private int id;
	private String name;
	private int age;
	private int seat_no;
	@ManyToOne
	private TrainDTO train;

}
