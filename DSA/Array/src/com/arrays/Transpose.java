package com.arrays;

public class Transpose {

	public static void main(String[] args) {
		

		int [][] arr = {{1,2,3},
						{4,5,6},
						{7,8,9}};
		
		int row = arr.length;
		int col = arr[0].length;
		
		
		int [][] tArr = new int [row][col];
		
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				tArr[j][i]=arr[i][j];
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(tArr[i][j]);
			}
			System.out.println();
		}

	}

}
