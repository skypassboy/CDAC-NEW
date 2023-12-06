package com.knowit;

public class Person {
	
	private String name;
	private Date bdate;
	
	
	public Person() {
		super();
		name = "-";
		bdate = new Date();
	}


	public Person(String name, Date bdate) {
		super();
		this.name = name;
		this.bdate = bdate;
//		this.bdate = new Date(dd,yy,mm)
	}
	
	
	public void display() {
			System.out.println("Display of person");
			System.out.println("name : "+ name);
			System.out.println("Birth Date : "+ bdate.toString());
	}
	
	
		
}
