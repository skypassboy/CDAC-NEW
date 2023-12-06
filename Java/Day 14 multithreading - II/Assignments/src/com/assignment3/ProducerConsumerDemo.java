package com.assignment3;

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		
				//common shared resource
				Stock s = new Stock();
				
				
				Producer p = new Producer(s);
				Consumer c = new Consumer(s);
				
				//runnable 
				p.getThread().start();
				c.getThread().start();
				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				p.stopNow();
				c.stopNow();
				
				try {
					p.getThread().join();
					c.getThread().join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("Total qty produced : "+s.qtyProdeced);
				System.out.println("Total qty consumed : "+s.qtyConsumed);
				
				
		
	}

}
