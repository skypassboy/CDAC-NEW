package com.assignment4;

public class MyTask2 implements Runnable{
	private Thread t;
	private int num2;
	private String name;
	
	public MyTask2() {
		t = new Thread(this);
//		t = new Thread(new MyThreadByClass());
	}
	
	public MyTask2(String name,int num2) {
		
		this.name = name;
		this.num2 = num2;
		t = new Thread(this);
	}
	public Thread getThread() {
		
		return t;
	}
	
	
	public void run() {
		
		for(int i=num2;i>=0;i--) {
				System.out.println(name +"-"+i);
		}
		
	}
	
	
}
