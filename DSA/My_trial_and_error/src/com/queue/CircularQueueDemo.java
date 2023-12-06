package com.queue;

public class CircularQueueDemo {

	public static void main(String[] args) {
		
		CircularQueue c = new CircularQueue(5);
		c.enQueue(10);
		c.deQueue();
		c.enQueue(20);
		c.enQueue(30);
		c.enQueue(40);
		c.enQueue(20);
		c.display();
	}
 
}
