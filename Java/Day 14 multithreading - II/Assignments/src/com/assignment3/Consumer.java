package com.assignment3;

public class Consumer implements Runnable {
	
	private Thread t;
	private boolean bRun;
	private Stock s;
	
	
	public Consumer() {
		
	}
	public Consumer(Stock s) {
		
		this.s = s;
		this.t = new Thread(this);
		this.bRun = true;
				
	}
	
	public Thread getThread() {
		return t;
	}
	
	public void stopNow() {
		bRun = false;
	}
	
	@Override
	public void run() {
		
		while(bRun)
			s.consume();
		
	}
}
