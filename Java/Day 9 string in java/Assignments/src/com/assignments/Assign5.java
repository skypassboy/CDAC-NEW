



package com.assignments;

public class Assign5 {

	public static void main(String[] args) {
		
		String str = "abbcccddddeee";
		int [] arr = new int [256];
		
		for(int i=0;i<=str.length()-1;i++) {
			arr[(int)(str.charAt(i))]++;
		}
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=0) {
				System.out.println((char)i+"----->"+arr[i]);
			}
		}
		
		
		
	}

}
