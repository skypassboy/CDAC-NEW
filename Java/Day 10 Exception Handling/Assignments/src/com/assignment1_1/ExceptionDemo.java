package com.assignment1_1;

public class ExceptionDemo {

	public static void main(String[] args) {
	
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			System.out.println(a/b);
			
		} 
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
	}

}
