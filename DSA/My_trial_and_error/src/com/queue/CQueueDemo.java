package com.queue;

public class CQueueDemo {

	public static void main(String[] args) {
	
		CQueue q = new CQueue(5);
		
		q.enQueue(10);
		q.enQueue(20); 
		q.enQueue(30);
		q.enQueue(40);
		q.deQueue();
		q.deQueue();
		q.display();
		

	}

}
