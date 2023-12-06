package com.userDefinedLinkedList;

public class Node {
	
	private Node next;
	private Employee data;
	
	
	public Node() {
		super();
		this.next=null;
		this.data = new Employee();
	}
	
	
	public Node(Employee data) {
		super();
		this.next = null;
		this.data = data;
	}


	public Node getNext() {
		return next;
	}


	public void setNext(Node next) {
		this.next = next;
	}


	public Employee getData() {
		return data;
	}


	public void setData(Employee emp) {
		this.data = emp;
	}


	@Override
	public String toString() {
		return data+" ";
	}
	
	
	
}
