package com.knowit;

public class Customer {
	
	private String emailId;
	private String address;
	private float price;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String emailId, String address,float price) {
		super();
		this.price = price;
		this.emailId = emailId;
		this.address = address;
	}

	
	public float giveDiscount(float price) {
		
		return price;
		
	}
	
	public void display() {
		System.out.println("Email ID : "+ emailId);
		System.out.println("Address : "+ address);
//		System.out.println("price : "+ price);
	}
	
	
	
}
