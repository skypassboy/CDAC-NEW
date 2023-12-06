package com.assignment4;

public class MyTask1 implements Runnable {
	
	private Thread t;
	private int num1;
	private String name;
	
	public MyTask1() {
		t = new Thread(this);
//		t = new Thread(new MyThreadByClass());
	}
	
	public MyTask1(String name,int num1) {
		
		this.name = name;
		this.num1 = num1;
		t = new Thread(this);
	}
	public Thread getThread() {
		
		return t;
	}
	
	
	public void run() {
		System.out.println("in run");
		
		for(int i=num1;i>=0;i--) {
				System.out.println(name +"-"+ i);
		}
		
	}
	
}
