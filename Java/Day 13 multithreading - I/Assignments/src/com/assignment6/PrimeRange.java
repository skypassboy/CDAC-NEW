package com.assignment6;

public class PrimeRange implements Runnable {
	
	private int start,end;
	private Thread t;
	
	public PrimeRange(int start, int end) {
		super();
		this.start = start;
		this.end = end;
		t= new Thread(this);
	}
	

	public Thread getT() {
		return t;
	}

	@Override
	public void run() {
		
		System.out.println("run");
		
		for(int i=start;i<=end;i++)
		{
			boolean flag=false;
			
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0) {
					flag=true;
				}
					
			}
			if(flag==false) {
				System.out.print(i+" , ");
			}				
		}

	}

}
