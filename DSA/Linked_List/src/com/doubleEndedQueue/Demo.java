package com.doubleEndedQueue;



public class Demo {

	public static void main(String[] args) {
		
		
   DoubleEndedQueue c1 = new DoubleEndedQueue();
		
		try {
//			c1.deQueue();
			c1.enQueueBeg(10);
			c1.enQueueEnd(20);
			c1.enQueueEnd(30);
			c1.enQueueBeg(100);
			c1.enQueueBeg(200);
			c1.deQueueEnd();
			System.out.println(c1.toString());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
