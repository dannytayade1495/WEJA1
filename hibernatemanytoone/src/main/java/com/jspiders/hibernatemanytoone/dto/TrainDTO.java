package com.jspiders.hibernatemanytoone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class TrainDTO {
	
	@Id
	private int id;
	private String name;
	private int train_no;

}
