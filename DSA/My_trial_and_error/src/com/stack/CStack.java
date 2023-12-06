package com.stack;

public class CStack {
	
	int size;
	int arr[];
	int top; 
	
	public CStack() {
		size = 3;
		arr = new int [size];
		top = -1;
	}
	
	public CStack(int size) {
		
		this.size = size;
		arr = new int [size];
		top = -1;
	}
	
	public boolean isEmpty() {
		
		return top==-1 ? true:false;
		
	}
	
	public boolean isFull() {
		return top == size-1 ? true : false;
	}
	
	public void push(int data) {
		
		if(isFull()) {
			throw new StackOverflowError("Stack over flow...!");
		}
		else {
			top++;
			arr[top] = data;
		}
		
	}
	
	public int pop() {
		
		int data;
		if(isEmpty()) {
			throw new IllegalStateException("Stack is empty...!");
		}
		else {
			data=arr[top];
			top--;
			return data;
		}
		
	}
	
	public void display() {
		System.out.println();
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
}
