package com.assignment3;

public class Admin extends Emp{
	
	private int bonus;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String name, Date bdate, int empId, double salary,int bonus) {
		super(name, bdate, empId, salary);
		this.bonus = bonus;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Admin [bonus=" + bonus + ", name=" + name + ", bdate=" + bdate + ", getEmpId()=" + getEmpId()
				+ ", getSalary()=" + getSalary() +" Salary of Emp having Empid "+getEmpId()+" is "+calSalary()+ "]";
	}
	
	
	public double calSalary() {
		return getSalary()+bonus;
	}
	
	
}
