package com.assignment4;

public class MyJob {

	public static void main(String[] args) throws InterruptedException  {
		
		
		System.out.println("Countdown Start...");
		
		MyTask1 t1 = new MyTask1("Thread 1",20);
		t1.getThread().start();
		MyTask2 t2 = new MyTask2("Thread 2",50);
		t2.getThread().start();
		
		MyTask3 t3 = new MyTask3("Thread 3",80);
		t3.getThread().start();
		
		t1.getThread().join();
		t2.getThread().join();
		t3.getThread().join();
		
		System.out.println("Countdown End...");
	}

}
