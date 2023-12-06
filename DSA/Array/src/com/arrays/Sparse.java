package com.arrays;

public class Sparse {

	public static void main(String[] args) {


		int [][] arr = {{1,0,2},
						{5,0,0},
						{6,0,0}};
		
		int count=0;
		int row = arr.length;
		int col = arr[1].length;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(arr[i][j]!=0) {
					count++;
				}
			}
		}
		

		
		int [][]sparse = new int [count+1][3];
		
		sparse[0][0] = row;
		sparse[0][1] = col;
		int k=1;
				
				for(int i=0;i<row;i++) {
					for(int j=0;j<col;j++) {
						if(arr[i][j]!=0) {
							sparse[k][0] = i;
							sparse[k][1] = j;
							sparse[k][2] = arr[i][j];
							k++;
						}
					}
				}
				
				for(int i=0;i<sparse.length;i++) {
					for(int j=0;j<sparse[0].length;j++) {
						System.out.print(" "+sparse[i][j]);
					}
					System.out.println();
				}

	}

}
