package com.stringlinkedlist;

public class SNode {
	
	String data;
	SNode next;
	
	public SNode() {
		super();
		this.data = " ";
		this.next = null;
	}
	
	public SNode(String data) {
		super();
		this.data = data;
		this.next = null;
	}

	@Override
	public String toString() {
		return  data+" ";
	}
	
	
	
}
