package com.assignment3;

public class SalesMananger extends Emp implements ITraveller{
	
	private int incentive;
	private int target;
	private int days;
	public SalesMananger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalesMananger(String name, Date bdate, int empId, double salary,int incentive, int target,int days) {
		
		super(name, bdate, empId, salary);
		this.incentive = incentive;
		this.target = target;
		this.days = days;
		
	}

	@Override
	public String toString() {
		return "SalesMananger [incentive=" + incentive + ", target=" + target + ", name=" + name + ", bdate=" + bdate
				+ ",EmpId =" +super.getSalary()+",EmpID :"+super.getEmpId()+" Salary of Emp having Empid "+getEmpId()+" is "+calSalary()+"Travelling Allowance= "+calculateTA()+"No of days travelled= "+days+"]";
	}
	
	public double calSalary() {
		return getSalary()+incentive*target;
	}

	@Override
	public double calculateTA() {
		// TODO Auto-generated method stub
		return days * (getSalary()*DA/100);
	}
	
	
	
	 
	 		
	
}
