package com.linkedListTrial1;

public class Node {
	
	
	int data;
	Node next;
	
	public Node() {
		data = 1;
		next = null;
	}
	public Node(int data) {
		this.data = data;
		next = null;
	}
	
	public String toString() {
		
		return data + " ";
		
	}
	
}
