package com.stack;

import java.util.Scanner;

public class BookStackDemo {

public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of Stack...");
		
		int stackSize = sc.nextInt();
		BookStack b1 = new BookStack(stackSize);
		int ch;
		do {
			System.out.println("Enter choise...");
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.display");
			System.out.println("4.peek");
			System.out.println("0.exit");
			System.out.println("*****************************************");
			 ch = sc.nextInt();
			 
			switch(ch) {
				case 1:
						System.out.println("Enter data to push...");
						System.out.println("Enter Name");
						String name = sc.next();
						System.out.println("Enter price");
						int price = sc.nextInt();
						
						b1.push(new Book(name,price));
						break;
				case 2:
						Book value = b1.pop();
						if(value!=null) {
							System.out.println(value);
						}
						else {
							System.out.println("Stack underflow...");
						}
						break;
				case 3:
						b1.display();
						break;
				case 4:
						Book p1 = b1.peek();
						System.out.println(p1);
						break;
			}
			
		}
		while(ch!=0);
		

	}

}
