package com.assignment1;

public class PasswordTooShortException extends Exception {
	
	private String msg;

	public PasswordTooShortException() {
		super();
		msg = "Password too short...";
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "PasswordTooShortException [msg=" + msg + "]";
	}
	
	
	
	
	
	
}
