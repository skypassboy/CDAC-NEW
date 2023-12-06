package com.assignment5;

public class StackUnderFlowException extends Exception{
	
	private String msg;

	public StackUnderFlowException() {
		super();
		this.msg = "StackUnderFlow...!";
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "StackUnderFlowException [msg=" + msg + "]";
	}
	
	
	
	
	
	
}
