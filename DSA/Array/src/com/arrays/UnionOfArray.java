package com.arrays;


//array needs to be sorted and array should contain only unique elements
public class UnionOfArray {

	public static void main(String[] args) {
		
		int [] arr1 = {1,2,3,4};
		int [] arr2 = {3,4,6,7,8,9};
//		int [] union = new int[];
		
		int a1 = arr1.length;
		int a2 = arr2.length;
		
		int i=0,j=0;
		
		while(i<a1 && j<a2) {
			
			if(arr1[i]<arr2[j]) {
				System.out.println(arr1[i]);
				i++;
			}
			else if(arr1[i]>arr2[j]) {
				System.out.println(arr2[j]);
				j++;
			}
			else {
				System.out.println(arr1[i]);
				i++;
				j++;
			}
			
		}
		
		while(i<a1) {
			System.out.println(arr1[i]);
			i++;
		}
		while(j<a2) {
			System.out.println(arr2[j]);
			j++;
		}

	}

}
