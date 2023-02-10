package com.jspiders.builderdesignpattern.builder;

import com.jspiders.builderdesignpattern.object.Contact;

public class ContactBuilder {
	
	private String first_name;
	private String middle_name;
	private String last_name;
	private String nickname;
	private String email;
	private long mobile_no;
	private long landline_no;
	private String dob;
	private String company;
	private String address;
	private String gender;
	
	public ContactBuilder first_name(String first_name) {
		this.first_name = first_name;
		return this;
	}
	
	public ContactBuilder middle_name(String middle_name) {
		this.middle_name = middle_name;
		return this;
	}
	
	public ContactBuilder last_name(String last_name) {
		this.last_name = last_name;
		return this;
	}
	
	public ContactBuilder nickname(String nickname) {
		this.nickname = nickname;
		return this;
	}
	
	public ContactBuilder email(String email) {
		this.email = email;
		return this;
	}
	
	public ContactBuilder mobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
		return this;
	}
	
	public ContactBuilder landline_no(long landline_no) {
		this.landline_no = landline_no;
		return this;
	}
	
	public ContactBuilder dob(String dob) {
		this.dob = dob;
		return this;
	}
	
	public ContactBuilder company(String company) {
		this.company = company;
		return this;
	}
	
	public ContactBuilder address(String address) {
		this.address = address;
		return this;
	}
	
	public ContactBuilder gender(String gender) {
		this.gender = gender;
		return this;
	}
	
	public Contact getContact() {
		Contact contact = new Contact(this.first_name, this.middle_name, 
				this.last_name, this.nickname, this.email, 
				this.mobile_no, this.landline_no, this.dob, 
				this.company, this.address, this.gender);
		return contact;
	}

}
