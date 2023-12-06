package com.dynamicQueue;

public class CQueue {
	
	Node front,rear;
	
	public CQueue() {
		front = rear = null;
	}
	public boolean isEmpty() {
		return rear == null? true:false;
	}
	
	public void enQueue(int data) {
		Node n1 = new Node(data);
		if(rear==null) {
			rear=front=n1;
		}
		else {
			rear.next = n1;
			rear=n1;
		}
	}
	
	public int deQueue() {
		if(isEmpty()) {
			 throw new IllegalStateException("Queue is empty...!");
		}
		int data;
		data = front.data;
		front = front.next;
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
