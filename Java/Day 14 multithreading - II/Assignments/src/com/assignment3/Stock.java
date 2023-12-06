package com.assignment3;

public class Stock {
	
	int qtyProdeced;
	int qtyConsumed;
	boolean bProduced;
	
	public Stock() {
		
		this.qtyProdeced = this.qtyConsumed = 0;
		this.bProduced = false;
		
	}
	
	public synchronized void produce() {
		
		if(bProduced) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		qtyProdeced++;
		System.out.println("Quantity Produced : " + qtyProdeced);
		bProduced = true;
		notify();

	}
	
	public synchronized void consume() {
		
		if(!bProduced) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		qtyConsumed++;
		System.out.println("Quantity Consumed : " + qtyConsumed);
		bProduced =false;
		notify();
		
	}
	
} 
