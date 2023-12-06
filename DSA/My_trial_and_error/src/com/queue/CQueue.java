package com.queue;

public class CQueue {
	
	int arr[];
	int size;
	int rear,front;
	
	public CQueue() {
		size = 3;
		arr = new int [size];
		rear = front = -1;
	}
	
	public CQueue(int size) {
		
		this.size = size;
		arr = new int[size];
		rear = front = -1;
		
	}
	
	public boolean isEmpty() {
		
		if(front==-1 && rear == -1) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean isFull() {
		
		return rear == size-1 ?true:false;
		
	}
	
	public void enQueue(int data) {
		
		if(isFull()) {
			throw new IllegalStateException("Queue is full...!");
		}
		else {
			if(front == -1) {
				front=0;
			}
			rear++; 
			arr[rear]=data;
		}
		
	}
	
	public int deQueue() {
		
		int data;
		if(isEmpty()) {
			throw new IllegalStateException("Queue is Empty...!");
		}
		else {
			
			data = arr[front];
			if(rear==front) {
				rear = front = -1;
			}
			else {
				
				front++;
			}
		}
		return data;
		
	}
	
	public void display() {
		System.out.println();
		for(int i=front;i<=rear;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	
}
