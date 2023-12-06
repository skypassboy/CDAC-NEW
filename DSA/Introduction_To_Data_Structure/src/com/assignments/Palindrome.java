package com.assignments;

public class Palindrome {

	
	public static boolean isPalindrome(int no) {
		
		int oriNo=no;
		int revNo=0;
		while(no!=0) {
			
			int mod = no%10;
			
			revNo = revNo*10+mod;
			
			no = no/10;
			
		}
		
		if(revNo==oriNo) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome(1232121));
		
	}

}
