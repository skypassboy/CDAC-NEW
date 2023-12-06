package com.BinaryTree;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		
		BinaryTree b1 = new BinaryTree();
		Scanner sc = new Scanner(System.in);
		int ch;
		
		do {
			System.out.println("Enter choise...");
			System.out.println("1.addNode");
			System.out.println("2.display");
			System.out.println("0.exit");
			ch = sc.nextInt();
			
			switch(ch) {
			
			case 1 : 
					System.out.println("Enter data to add...");
					b1.addNode(sc.nextInt());
					break;
			case 2 : 
					b1.display();
					break;

			}

		}while(ch!=0);
		
		

	}

}
