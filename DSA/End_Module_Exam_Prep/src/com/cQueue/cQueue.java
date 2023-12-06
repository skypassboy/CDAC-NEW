package com.cQueue;

public class cQueue {

	int arr[];
	int size;
	int front;
	int rear;

	
	public cQueue(int size) {
		
		this.size = size;
		arr = new int[size];
		front = rear = -1;
		
	}
	
	public cQueue() {
		this.size = 3;
		arr = new int[size];
		front = rear = -1;
	}
	
	public boolean isEmpty() {
		
		if(front==-1) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean isFull() {
		
		if(front == (rear+1)%size) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void enQueue(int data) {
		
		if(!isFull()) {
			if(front==-1) {
				front=0;
			}
			rear=(rear+1)%size;
			arr[rear]=data;
			
		}
		else {
			
			throw new IllegalStateException("queue full...!");
			
		}
		
	}
	
	public int deQueue() {
		
		if(isEmpty()) {
			throw new IllegalStateException("queue is Empty...!");
		}
		else {
			
			int ele = arr[front];
			
			if(front==rear) {
				front = rear = -1;
			}
			
			front = (front+1)%size;
			
			return ele;
		}
		
	}
	
    public void display() {
    	
    	if (!isEmpty()) {
			int i;
			for (i = front; i != rear; i = (i + 1) % size) {
				System.out.println(arr[i]);
			}
			if (i == rear) {
				System.out.println(arr[i]);
			}
		} else {
			System.out.println("Queue is Empty...!");
		}
    }
	
	
	

}
