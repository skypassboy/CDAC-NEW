package com.dynamicQueue;

public class Demo {

	public static void main(String[] args) {
		
		
		
		CQueue c1 = new CQueue();
		
		try {
//			c1.deQueue();
			c1.enQueue(10);
			c1.enQueue(20);
			c1.enQueue(30);
			System.out.println(c1.toString());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
