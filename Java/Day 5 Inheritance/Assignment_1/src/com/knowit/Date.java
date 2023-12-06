package com.knowit;

public class Date {
	private int dd;
	private int mm;
	private int yy;
	
	
	public Date() {
		super();
		dd = 1;
		mm = 1;
		yy = 2023;
	}
	
	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	
	
}
