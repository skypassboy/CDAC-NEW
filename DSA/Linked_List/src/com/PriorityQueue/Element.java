package com.PriorityQueue;

public class Element {
	
	int data;
	int pri;
	
	
	public Element() {
		
	}
	
	public Element(int data,int pri) {
		this.data = data;
		this.pri = pri;
	}
	
	
	@Override
	public String toString() {
		return "Element [data=" + data + ", pri=" + pri + "]";
	}
	
	
	
	
}
