package com.assignment5;

import java.util.Arrays;

public class Stack {
	
	private int [] arr;
	private int size;
	private int top;
	
	public Stack() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Stack(int size) {
		super();
		this.arr = new int [size];
		this.size = size;
		this.top = -1;
	}

	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getTop() {
		return top;
	}
	public void setTop(int top) {
		this.top = top;
	}
	
	
	
	public void push(int n) throws StackOverFlowException{
		
		if(top==size-1) {
			throw new StackOverFlowException();
		}
		++top;
		arr[top]=n;
		
	}
	
	public int pop()throws StackUnderFlowException {
		if(top==-1) {
			throw new StackUnderFlowException();
		}
		
			return arr[top--];
	}

	@Override
	public String toString() {
		return "Stack [arr=" + Arrays.toString(arr)+"]";
	}
	
	
	
}
