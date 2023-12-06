package com.assignment5;

public class StackOverFlowException extends Exception {
	
	private String msg;

	public StackOverFlowException() {
		super();
		this.msg = "StackOverFlow...!";
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "StackOverFlowException [msg=" + msg + "]";
	}
	
	
	
}
