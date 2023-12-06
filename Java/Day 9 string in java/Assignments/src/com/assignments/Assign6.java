//occurances of characters

package com.assignments;

public class Assign6 {

	public static void main(String[] args) {
		
		
		String str = "aaabbcddawda";
		
		int [] arr = new int [256];
//		int ch=1;
		for(int i=0;i<str.length();i++) {
			int ch = (int)(str.charAt(i));
			arr[ch]++;
		}
		
		for(int i = 0;i<arr.length;i++) {
			
			if(arr[i]!=0) {
				System.out.println((char)i+" --------> "+arr[i]);
			}
		}
	
	}
}