package com.stack;

public class BookStack {
	
	private int size;
	private Book [] arr;
	private int top;
	private Book b;
	
	public BookStack() {
		size = 3;
		arr = new Book [size];
		top=-1;
	}

	public BookStack(int size) {
		super();
		this.size = size;
		this.arr = new Book[size];
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
	
	public void push(Book data) {
		
		if(top!=size-1) {
			top++;
			arr[top]=data;
		}
		else {
			System.out.println("Stack Overflow...!");
		}
		
	}
	
	public Book pop() {
		
		Book data= null;
		if(!isEmpty()) {
			data=arr[top];
			top--;
		}
		return data;
	}
	
	public Book peek() {
		Book data=null;
		if(!isEmpty()) {
			data = arr[top];
		}
		return data;
	}
	
	
	
	
}
