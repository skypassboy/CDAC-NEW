package com.knowit;

public class RegCustomer extends Customer{
	
	private int regNo;

	public RegCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	public RegCustomer(String emailId, String address, float price,int regNo) {
		super(emailId, address, price);
		this.regNo = regNo;
		// TODO Auto-generated constructor stub
	}

	
	public float giveDiscount(float price) {
		
		return (price - (price*0.05f));
		
	}
	
	public void display() {
		
		System.out.println("Registration no : "+regNo);
//		System.out.println("Price : "+ giveDiscount());
		super.display();
	}
	
	
	

}
