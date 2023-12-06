package com.assignment1;

public class MyThread implements Runnable{

	@Override
	public void run() {
		
		for(int i=1;i<=10;i++) {
			System.out.println("child thread prints : "+i);
		}
		
	}
	
	
	
	public static void main(String [] args) throws InterruptedException {
		
		
		MyThread m = new MyThread();
		
		Thread t1 = new Thread(m);
		
		t1.start();
		Thread currentThread = Thread.currentThread();
		System.out.println(t1.getPriority());
		System.out.println(t1.getName());;
		
		for(int i=10;i<=20;i++) {
			
//			System.out.println("main thread prints : "+i);
//			Thread.sleep(5000);
			
		}
		
		System.out.println(currentThread.getName());
		System.out.println(currentThread.getPriority());
		System.out.println(currentThread.MAX_PRIORITY);
		
		
	}

	
}
