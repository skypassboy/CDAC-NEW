package com.search;

public class BinarySearch {
	
	
	public static int binarySearch(int arr[], int key) {
		int low=0;
		int high=arr.length-1;
		int mid=0;
		
		
		while(low<=high) {
			mid=(low+high)/2;
			if(key==arr[mid]) {
				return mid;
			}
			else if(key<arr[mid]) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
	
		
		int [] arr = {1,2,3,4,9,45,65,87,87};
		
		
		int key=9;
		
		int res=binarySearch(arr,key);
		
		
		if(res==-1) {
			System.out.println("not found");
		}
		else {
			System.out.println("found at index :"+ res);
		}
	}

}
