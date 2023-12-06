package com.knowit;

public class Emp extends Person {
	
	private int empId;
	private double salary;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Emp(String name, Date bdate ,int empId, double salary) {
//		super(name,dd,mm,yy);
		super(name,bdate);
		this.empId = empId;
		this.salary = salary;
	}
	
	public void display() {
			System.out.println("Display of Emp");
			System.out.println("Emp Id : "+ empId);
			System.out.println("Salary : "+ salary);
			super.display();
			
	}
	
	
	
	
}
