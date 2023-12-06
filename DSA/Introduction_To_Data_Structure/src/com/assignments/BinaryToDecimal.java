package com.assignments;

public class BinaryToDecimal {

	
	public static int binaryToDecimal(int binary) {
		
		
		int decimal=0;
		int n=0;
		
		while(true) {
			
			if(binary==0) {
				break;
			}
			else {
				int temp = binary%10;
				System.out.println(temp);
				decimal +=temp*Math.pow(2,n);
				binary = binary/10;
				n++;
			}
		}
		return decimal;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(binaryToDecimal(1010));
		

	}

}
