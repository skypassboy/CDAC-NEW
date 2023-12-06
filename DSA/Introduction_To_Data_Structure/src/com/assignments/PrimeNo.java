package com.assignments;



public class PrimeNo {
	
	public static Boolean isPrime(int no) {
		
		int count = 0;
		if(no<2) {
			return false;
		}
		else {
			
			for(int i=1;i<=no;i++) {
				if(no%i==0) {
					count++;
				}
			}
			
			if(count==2) {
				return true;
			}
			else {
				return false;
			}	
		}

	}
	public static void main(String[] args) {
		
		
		for(int i=1;i<=100;i++) {
		
			if(PrimeNo.isPrime(i)) {
				System.out.println(i);
			}
		}
		
		
		
	}

}
