package com.assignment2;

import java.io.Serializable;

public class Customer implements Serializable{
	
	private String name;
	private String emailId;
	private double contactNo;
	
	
	public Customer() {
		super();
	}


	public Customer(String name, String emailId, double contactNo) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.contactNo = contactNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public double getContactNo() {
		return contactNo;
	}


	public void setContactNo(double contactNo) {
		this.contactNo = contactNo;
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", emailId=" + emailId + ", contactNo=" + contactNo + "]";
	}
	
	
	
	
}
