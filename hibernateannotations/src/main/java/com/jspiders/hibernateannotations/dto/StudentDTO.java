package com.jspiders.hibernateannotations.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class StudentDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "name")
	private String stud_name;
	@Column(name = "percent")
	private double percentage;
	@Column(name = "city")
	private String stud_city;

}
