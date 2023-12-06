package com.arrays;

public class ArrayLeftShift {

	
	public static void leftShift(int[]arr,int k) {
		
		
		
		int []temp = new int [arr.length];
		
		
		int z = 0;
		
		for(int i=k;i<arr.length;i++) {
			temp[z]=arr[i];
			z++;
		}
		
		for(int i=0;i<k;i++) {
			temp[z]=arr[i];
			z++;
		}
		
		for(int i: temp) {
			System.out.println(i);
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5};
		
		int k=2;
		
		leftShift(arr,k);

	}

}
