package com.knowit;

public class Person {
	
	private String name;
	
	public Person() {
		super();
		name = "-";
	}


	public Person(String name) {
		super();
		this.name = name;
	
	}

	public void display() {
			System.out.println("Display of person");
			System.out.println("name : "+ name);
	}
	
}
