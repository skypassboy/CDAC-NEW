package com.assignment1;

public class PasswordTooLongException extends Exception {
	
	private String msg;

	

	public PasswordTooLongException() {
		super();
		this.msg = "Password too long...";
	}


	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	
	@Override
	public String toString() {
		return "PasswordTooLongException [msg=" + msg + "]";
	}
	
	
	
	
}
