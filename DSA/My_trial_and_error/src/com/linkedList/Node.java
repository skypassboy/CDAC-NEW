package com.linkedList;

public class Node {
	
	int data;
	Node next;
	
	public Node(){
		
		this.data = 1;
		this.next = null;
	}
	
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}

	@Override
	public String toString() {
		return data+" ";
	}
	
	
	
	
	
}
