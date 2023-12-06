package com.assignment3;

public class Producer implements Runnable{
	
	private Thread t;
	private boolean bRun;
	private Stock s;
	
	
	public Producer() {
		
	}
	public Producer(Stock s) {
		
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
			s.produce();
		
	}
	
	
}
