package com.jspiders.serializationdesrialization.object;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	int id;
	String name;
	String email;
	
	public User(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name 
				+ ", email=" + email + "]";
	}
}
