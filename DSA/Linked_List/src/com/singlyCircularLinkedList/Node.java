package com.singlyCircularLinkedList;

public class Node {
	
	int data;
	Node next;
	
	public Node(){
		this.data = 1;
		this.next = null;
	}
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	public String toString() {
		
		return data+" ";
		
	}
	
}
