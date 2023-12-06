package com.assignment5;

public class Emp{
	
	private String name;
	private int empid;
	private int deptno;
	private double salary;
	

	public Emp() {
		super();
	}

	public Emp(String name, int empid, int deptno, double salary) {
		super();
		this.name = name;
		this.empid = empid;
		this.deptno = deptno;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", empid=" + empid + ", deptno=" + deptno + ", salary=" + salary + "]";
	}


	
	
}
