package com.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		
		int []arr = {1,6,7,2,3,8,9};
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count++;
				}
				System.out.println("count"+count);
			}
		}
		
		for(int i : arr) {
			System.out.print(i);
		}
		
	}

}
