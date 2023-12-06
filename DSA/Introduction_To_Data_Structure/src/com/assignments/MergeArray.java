package com.assignments;

public class MergeArray {

	public static void main(String[] args) {
		
		
		int []arr1 = {1,2,3,4,5};
		int []arr2 = {6,7,8};
		
		int []mergeArray = new int [arr1.length+arr2.length];
		
		int position=0;
		
		for(int i : arr1) {
			mergeArray[position]=i;
			position++;
		}
		
		for(int i : arr2) {
			mergeArray[position]=i;
			position++;
		}
		
		for(int i : mergeArray) {
			System.out.println(i);
		}

	}

}
