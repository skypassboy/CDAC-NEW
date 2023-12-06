package com.assignment2;

public class InvalidCountryException extends Exception {
	
	private String msg;


	public InvalidCountryException() {
		
		super();
		this.msg = "Invalid Country";
		
	}
	
		
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String toString() {
		
		return msg;
	}
	
	
}
