package com.assignment1;

public class Print {
	
	public synchronized void printContent(String header,String body,String footer) {
		
		try
		{
			System.out.print(header);
			Thread.sleep(1000);
			System.out.print(body);
			Thread.sleep(1000);
			System.out.print(footer);
			System.out.println();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
	
	
}
