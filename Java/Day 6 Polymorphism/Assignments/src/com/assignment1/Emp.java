package com.assignment1;

public abstract class Emp extends Person {
	
	private int empId;
	private double salary;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, Date bdate) {
		super(name, bdate);
		
	}
	
	
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public Emp(String name, Date bdate ,int empId, double salary) {
		super(name,bdate);
		this.empId = empId;
		this.salary = salary;
	}
	
	
	public abstract  double calSalary();
	
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", salary=" + salary + ",name="+name + ",Date="+bdate+"]";
	}
	
	
	
	
//	public void display() {
//			System.out.println("Display of Emp");
//			System.out.println("Emp Id : "+ empId);
//			System.out.println("Salary : "+ salary);
//			super.display();
//			
//	}
	
	
	
	
}

