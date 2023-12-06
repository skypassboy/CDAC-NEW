package com.assignments;

public class PerfectNo {
	
	
	
	public static boolean perfectNo(int no) {
		
		int sum = 0;
		int temp=no;
		
		for(int i=1;i<=no/2;i++) {
			if(no%i==0) {
				sum=sum+i;
			}
		}
		
		if(sum==temp) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(perfectNo(20));

	}

}
