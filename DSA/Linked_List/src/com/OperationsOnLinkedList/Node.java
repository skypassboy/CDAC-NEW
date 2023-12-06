package com.OperationsOnLinkedList;

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

	

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLink() {
		return next;
	}

	public void setLink(Node next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "data : "+ data ;
	}
}
