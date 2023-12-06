package com.assignment3;

public class InvalidColorException extends Exception {
		
	
	private String msg;

	public InvalidColorException() {
		super();
		this.msg = "Invalid color...!";
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "InvalidColorException [msg=" + msg + "]";
	}
	
	
	
	
	
	
	
	
}
