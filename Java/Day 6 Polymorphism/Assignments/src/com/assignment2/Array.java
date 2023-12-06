package com.assignment2;

public class Array {
	
	
	
	public void sorted(int [] arr) {
		
//		int [] newarr = new int[arr.length];
		
//		int temp;
		for(int i=0;i<arr.length-1;i++) {
			int temp;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		
	}
	
	
	
}
