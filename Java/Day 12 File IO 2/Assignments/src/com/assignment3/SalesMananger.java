package com.assignment3;

public class SalesMananger extends Emp{
	
	private int incentive;
	private int target;

	public SalesMananger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalesMananger(String name, Date bdate, int empId, double salary,int incentive, int target) {
		
		super(name, bdate, empId, salary);
		this.incentive = incentive;
		this.target = target;
		
	}

	@Override
	public String toString() {
		return "SalesMananger [incentive=" + incentive + ", target=" + target + ", name=" + name + ", bdate=" + bdate
				+ ",EmpId =" +super.getSalary()+",EmpID :"+super.getEmpId()+" Salary of Emp having Empid "+getEmpId()+" is "+calSalary()+"]";
	}
	
	public double calSalary() {
		return getSalary()+incentive*target;
	}
	
	
	
	 
	 		
	
}
