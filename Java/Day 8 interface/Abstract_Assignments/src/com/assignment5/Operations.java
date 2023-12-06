package com.assignment5;

public class Operations implements StringOperations {

	@Override
	public void reverse(String str) {
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		
		System.out.println(rev);
	}

	@Override
	public void toUpperCase(String str) {
		
	}

	@Override
	public int length(String str) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isPallindrome(String str) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String stringAppend(String str1, String str2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}	
