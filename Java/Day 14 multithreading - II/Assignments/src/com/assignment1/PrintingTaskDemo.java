package com.assignment1;

public class PrintingTaskDemo {

	public static void main(String[] args) {
	
		Print p = new Print();
		
		PrintingTask t1 = new PrintingTask("{", "}","Welcome",p);
		PrintingTask t2 = new PrintingTask("[", "]","Welcome to java",p);
		PrintingTask t3 = new PrintingTask("(", ")","Welcome to thug life",p);
		
		System.out.println("printing task begins...");
		
		t1.getThread().start();
		t2.getThread().start();
		t3.getThread().start();
		
		
		try {
			t1.getThread().join();
			t2.getThread().join();
			t3.getThread().join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Printing task ends...");
	}

}
