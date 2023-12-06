package com.assignment3;

public class Programmer extends Emp {
	
	private int extraHours;
	private int charges_per_hour;
	
	
	public Programmer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Programmer(String name, Date bdate, int empId, double salary,int extraHours, int charges_per_hour) {
		super(name, bdate, empId, salary);
		this.extraHours = extraHours;
		this.charges_per_hour = charges_per_hour;
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Programmer [extraHours=" + extraHours + ", charges_per_hour=" + charges_per_hour + ", name=" + name
				+ ", bdate=" + bdate + ", getEmpId()=" + getEmpId() + ", getSalary()=" + getSalary() +" Salary of Emp having Empid "+getEmpId()+" is "+calSalary()+ "]";
	}

	public double calSalary() {
		return getSalary()+extraHours*charges_per_hour;
	}
	
	
	
	
	
}
