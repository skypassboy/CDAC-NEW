package com.PriorityQueue;

public class Demo {

	public static void main(String[] args) {
		
		
		CQueue q1 = new CQueue(5);
		
		q1.enQueue(new Element(10, 2));
		q1.enQueue(new Element(12, 3));
		q1.enQueue(new Element(13, 1));
		q1.enQueue(new Element(20, 7));
		q1.enQueue(new Element(26, 8));
		q1.display();
//		q1.enQueue(new Element(10, 7));
		
	
		
	}

}
