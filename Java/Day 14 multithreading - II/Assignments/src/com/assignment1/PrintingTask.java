package com.assignment1;

public class PrintingTask implements Runnable {
	
	private Thread t;
	private String header;
	private String footer;
	private String body;
	private Print print;
	
	
	public PrintingTask () {
		
	}
	public PrintingTask (String header,String footer,String body,Print print){
		
		super();
		this.print = print;
		this.body = body;
		this.footer = footer;
		this.header = header;
		this.t = new Thread(this);

	}
	
	public Thread getThread()
	{
		return t;
	}

	
	
	@Override
	public void run() {
		
		print.printContent(header,body,footer);
		
	}
	
}


