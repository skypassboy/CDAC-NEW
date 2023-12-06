package com.arrays;

public class ArraySum2d {

	public static void main(String[] args) {


		int [][] arr1 = {{1,2,3},
						{4,5,6},
						{7,8,9}};
		
		int [][] arr2 = {{10,11,12},
						{14,15,16},
						{17,88,19}};
		
		
		int [][] arr = new int[3][3];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
