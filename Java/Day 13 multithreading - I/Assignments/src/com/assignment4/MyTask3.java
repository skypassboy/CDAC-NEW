package com.assignment4;

public class MyTask3 implements Runnable {
	
	private Thread t;
	private int num3;
	private String name;
	
	public MyTask3() {
		t = new Thread(this);
//		t = new Thread(new MyThreadByClass());
	}
	
	public MyTask3(String name,int num3) {
		
		this.name = name;
		this.num3 = num3;
		t = new Thread(this);
	}
	public Thread getThread() {
		
		return t;
	}
	
	
	public void run() {
		
		for(int i=num3;i>=0;i--) {
				System.out.println(name + "-"+i);
		}
		
	}
	
}
