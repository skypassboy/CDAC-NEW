package com.graph;

import java.util.Scanner;

public class Graph {
	
	int ver;
	int arr[][];
	
	public Graph(int size) {
		ver = size;
		arr = new int[size][size];
	}
	
	Scanner sc = new Scanner(System.in);
	public void acceptGraph() {
		for(int i=0;i<ver;i++) {
			for(int j=0;j<ver;j++) {
				System.out.println("Enter adjecency for "+i+" "+j);
				int no = sc.nextInt();
				arr[i][j] = no;
			}
		}
	}
	
	public void addEdge(int i,int j) {
		arr[i][j]=1;
		arr[j][i]=1;
	}
	
	public void display() {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
