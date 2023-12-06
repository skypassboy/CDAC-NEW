package com.assignment2;

public class MyThreadByClass extends Thread {
		
	private Thread t;
	
	public MyThreadByClass() {
		t = new Thread(this);
//		t = new Thread(new MyThreadByClass());
	}
	
	public Thread getThread() {
		
		return t;
	}
	
	
	public void run() {
		
		for(int i=1;i<=5;i++) {
			System.out.println("child thread prints : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
}
