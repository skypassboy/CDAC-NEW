package com.BinarySearchTree;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		BinarySearchTree b1 = new BinarySearchTree();
		Scanner sc = new Scanner(System.in);
		int ch;
	
		do {
			System.out.println("Enter choise...");
			System.out.println("1.addNode");
			System.out.println("2.display");
			System.out.println("3.height");
			System.out.println("4.search");
			System.out.println("5.delete");
			System.out.println("6.highest element");
			System.out.println("7.lowest element");
			System.out.println("8.level wise print");
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
					
			case 3 : 
					System.out.println("Height is : "+ b1.height(b1.root));
					break;
//					
			case 4 : 
					System.out.println("Enter data to search...");
					int data =sc.nextInt();
					//b1.searchData(data) ? System.out.println("Present") : System.out.println("Not-Present");
					System.out.println(b1.searchData(data) ? "Present" : "Not-Present");

//					if(b1.searchData(data)) {
//						System.out.println("present");
//					}
//					else {
//						System.out.println("not present");
//					}
					break;
			case 5 : 
					System.out.println("Enter data to delete...");
					b1.delete(sc.nextInt());
					break;
//			case 6 : 
//	                System.out.println("Highest element is "+ b1.highestElement());			
//	                break;
//			case 7 : 
//				System.out.println("Lowest element is "+ b1.lowestElement());			
//                break;
//            
//			case 8 : 
//					System.out.println();
//					b1.levelWiseDisplay();
//					break;
			}
					
		}while(ch!=0);

	}

}
