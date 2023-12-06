package com.graph;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter vertices...");
		int v = sc.nextInt();
		Graph g = new Graph(v);

		
		for(int k=0;k<6;k++) {
			System.out.println("For egde "+(k+1));
			System.out.println("Enter i");
			int i = sc.nextInt();
			System.out.println("Enter j");
			int j = sc.nextInt();
			g.addEdge(i, j);
		}
		
		g.display();
	}

}
