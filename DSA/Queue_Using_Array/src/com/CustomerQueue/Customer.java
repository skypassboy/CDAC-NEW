package com.CustomerQueue;

public class Customer {
	
	private String cname;
	private int cno;
	
	
	public Customer() {
		
	}

	public Customer(String cname, int cno) {
		super();
		this.cname = cname;
		this.cno = cno;
	}

	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", cno=" + cno + "]";
	}
	
	
	
	
	
}
