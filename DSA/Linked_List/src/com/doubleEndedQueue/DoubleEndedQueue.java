package com.doubleEndedQueue;



public class DoubleEndedQueue {
	
	Node front,rear;
	
	DoubleEndedQueue(){
		front=rear=null;
	}
	
	public boolean isEmpty() {
		return rear == null? true:false;
	}
	
	public void enQueueBeg(int data) {
		
		Node n1 = new Node(data);
		
		if(rear==null) {
			rear=front=n1;
		}
		else {
			n1.next = front;
			front = n1;
		}
		
	}
	
	public void enQueueEnd(int data) {
		
		Node n1 = new Node(data);
		if(rear==null) {
			rear=front=n1;
		}
		else {
			rear.next = n1;
			rear=n1;
		}
	}
	
	public int deQueueFront() {
		
		if(isEmpty()) {
			 throw new IllegalStateException("Queue is empty...!");
		}
		int data;
		data = front.data;
		front = front.next;
		return data;
		
	}
	public int deQueueEnd() {
		if(isEmpty()) {
			 throw new IllegalStateException("Queue is empty...!");
		}
		int data;
		data = rear.data;
		Node move = front;
		while(move.next.next!=null) {
			move = move.next;
		}
		rear = move;
		return data;
	}
	
	
	public String toString() {
		
		String str = " ";
		Node move = front;
		while(move!=rear) {
			str = str+move.data+" ";
			move = move.next;
		}
		str = str+move.data;
		return str;
		
	}
	
}
