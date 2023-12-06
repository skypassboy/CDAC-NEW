package com.assignments;

public class FirstTenPrime {
	
	
	
	
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
		
		int count=0;
		int no = 1;
			for(int i=1;i<=no;i++) {
				
				if(FirstTenPrime.isPrime(no)) {
					count++;
					System.out.println(no);
				}
				if(count==10) {
					break;
				}
				no++;
			}

	}

}
