package com.stack;

public class CStack {
	
	private int size;
	private int []arr;
	private int top;
	
	public CStack() {
		size = 3;
		arr = new int [size];
		top=-1;
	}

	public CStack(int size) {
		super();
		this.size = size;
		this.arr = new int [size];
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
	
	public void push(int data) {
		
		if(top!=size-1) {
			top++;
			arr[top]=data;
		}
		else {
			System.out.println("Stack Overflow...!");
		}
		
	}
	
	public int pop() {
		
		int data=-9999;
		if(!isEmpty()) {
			data=arr[top];
			top--;
		}
		return data;
	}
	
	public int peek() {
		int data=-9999;
		if(!isEmpty()) {
			data = arr[top];
		}
		return data;
	}
	
	
	
	
}
