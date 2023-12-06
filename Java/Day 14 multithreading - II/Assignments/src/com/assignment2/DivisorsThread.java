package com.assignment2;

import java.io.FileWriter;

public class DivisorsThread implements Runnable{
	
	
	private Thread t;
	private int number;
	private FileWriter fw;
	
	public DivisorsThread() {
		
	}
	public DivisorsThread(int number, FileWriter fw) {
		
		this.t = new Thread(this);
		this.number = number;
		this.fw = fw;
		
	}
	
	public Thread getThread() {
		return t;
	}
	
	
	
	
	@Override
	public void run() {
		synchronized (fw) {
			
		
			try {
				fw.write("divisors of number : "+number+ " are");
				for(int i = 1;i<=number;i++ ) {
					if(number%i==0) {
						fw.write(" "+i+",");
					}
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	

}
