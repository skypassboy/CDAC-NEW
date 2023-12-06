package com.assignment3;

import java.io.Serializable;

public class Person implements Serializable{
	


	protected String name;
	protected Date bdate;
	
	
	public Person() {
		super();
		name = "-";
		bdate = new Date();
	}


	public Person(String name, Date bdate) {
		super();
		this.name = name;
		this.bdate = bdate;
	}
	
	
//	public void display() {
//			System.out.println("Display of person");
//			System.out.println("name : "+ name);
//			System.out.println("Birth Date : "+ bdate.toString());
//	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", bdate=" + bdate + "]";
	}
	
		
}

