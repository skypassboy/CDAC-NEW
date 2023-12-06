package com.queue;

public class CircularQueue {
	
	int size;
	int arr[];
	int rear,front;
	
	public CircularQueue() {
		size = 3;
		arr = new int [size];
		rear = front = -1;
	}
	
	public CircularQueue(int size) {
		this.size = size;
		arr = new int [size];
		rear = front = -1;
	}
	
	public boolean isEmpty() {

		if (front == -1) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isFull() {

		if (front == (rear +1)%size) {
			return true;
		} else {
			return false;
		}
	}
	
	public void enQueue(int data) {
		
		if(isFull()) {
			throw new IllegalStateException("Queue is full...!");
		}
		else {
			if(front==-1) {
				front=0;
			}
			rear = (rear+1)%size; 
			arr[rear]= data;
		}
		
	}
	
	public int deQueue() {
		
		int data;
		if(isEmpty()) {
			throw new IllegalStateException("Queue is Empty...!");
		}
		else {
			data = arr[front];
			if(front==rear) {
				front = rear = -1;
			}
			else {
				front = (front+1)%size;
			}
		}
		return data;
		
	}
	
	public void display() {
		
		if(isEmpty()) {
			throw new IllegalStateException("Queue is Empty...!");
		}
		else {
			int i;
			
			for(i=front;i!=rear;i=(i+1)%size) {
				System.out.print(arr[i]+" ");
			}
			if(i==rear) {
				System.out.println(arr[i]);
			}
			
		}
	}
	
}
