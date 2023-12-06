package com.userDefinedLinkedList;

public class Employee {
	
	private int eno;
	private String ename;

	public Employee() {
		super();
	}

	public Employee(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + "]";
	}
	
	
	
	
	
	
}
