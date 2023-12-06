package com.assignments;

public class Power {
	
	public static int power(int base,int index) {
		
		
		int value=1;
		
		for(int i=1;i<=index;i++) {
			value = value*base;
		}
		
		return value;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(power(2,3));
	}

}
