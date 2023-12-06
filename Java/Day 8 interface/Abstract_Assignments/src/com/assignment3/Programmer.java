package com.assignment3;

public class Programmer extends Emp implements ITraveller {
	
	private int extraHours;
	private int charges_per_hour;
	private int days;
	
	public Programmer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Programmer(String name, Date bdate, int empId, double salary,int extraHours, int charges_per_hour,int days) {
		super(name, bdate, empId, salary);
		this.extraHours = extraHours;
		this.charges_per_hour = charges_per_hour;
		this.days =days;
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Programmer [extraHours=" + extraHours + ", charges_per_hour=" + charges_per_hour + ", name=" + name
				+ ", bdate=" + bdate + ", getEmpId()=" + getEmpId() + ", getSalary()=" + getSalary() +" Salary of Emp having Empid "+getEmpId()+" is "+calSalary()+ "Travelling Allowance= "+calculateTA()+"No of days travelled= "+days+"]";
	}

	public double calSalary() {
		return getSalary()+extraHours*charges_per_hour;
	}


	@Override
	public double calculateTA() {
		// TODO Auto-generated method stub
		return days * (getSalary()*DA/100);
	}
	
	
	
	
	
}
