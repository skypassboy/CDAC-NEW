package com.stack;

import java.util.Scanner;

public class CStackDemo {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of Stack...");
		
		int stackSize = sc.nextInt();
		CStack s1 = new CStack(stackSize);
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
						s1.push(sc.nextInt());
						break;
				case 2:
						int value = s1.pop();
						if(value!=-9999) {
							System.out.println(value);
						}
						else {
							System.out.println("Stack underflow...");
						}
						break;
				case 3:
						s1.display();
						break;
				case 4:
						int p1 = s1.peek();
						System.out.println(p1);
						break;
			}
			
		}
		while(ch!=0);
		

	}

}
