package com.stack;

public class CharStack {
	private int size;
	private char []arr;
	private int top;
	
	public CharStack() {
		size = 3;
		arr = new char [size];
		top=-1;
	}

	public CharStack(int size) {
		super();
		this.size = size;
		this.arr = new char [size];
		this.top = -1;
	}
	
	public boolean isEmpty() {
			
		if(top==-1) {
			return true;
		}
		else {
			return false;
		}
	
	}
	
	
	public void display() {
		
		if(!isEmpty()) {
			for(int i=top;i>=0;i--) {
				System.out.println(arr[i]);
			}
		}
		else {
			System.out.println("Stack is empty");
		}
		
	}
	
	public void push(char data) {
		
		if(top!=size-1) {
			top++;
			arr[top]=data;
		}
		else {
			System.out.println("Stack Overflow...!");
		}
		
	}
	
	public char pop() {
		
		char data='x';
		if(!isEmpty()) {
			data=arr[top];
			top--;
		}
		return data;
	}
	
	public char peek() {
		char data='x';
		if(!isEmpty()) {
			data = arr[top];
		}
		return data;
	}
	
}
