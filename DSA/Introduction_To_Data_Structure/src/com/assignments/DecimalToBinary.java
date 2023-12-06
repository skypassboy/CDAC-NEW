package com.assignments;

public class DecimalToBinary {

	
	public static void decimalToBinary(int decimal) {
		
		
		int binary[] = new int[40];
		int index = 0;
		
		while(decimal>0) {
			
			binary[index] = decimal%2;
			index++;
			decimal=decimal/2;
		}
		
		for(int i=index-1;i>=0;i--) {
			System.out.print(binary[i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		decimalToBinary(123);
		
		
	}

}
