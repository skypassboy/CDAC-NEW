package com.arrays;

public class IntersectionOfArrays {

	public static void main(String[] args) {
		int [] arr1 = {1,2,3,4};
		int [] arr2 = {3,4,6,7,8,9};
		
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

}
