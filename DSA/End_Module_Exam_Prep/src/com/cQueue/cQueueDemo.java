package com.cQueue;

import java.util.Scanner;


public class cQueueDemo {

public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of queue...");
		int size=sc.nextInt();
		cQueue q = new cQueue(size);
		int ch;
		int data;
		do {
			System.out.println("Enter choise...");
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Display");
			System.out.println("0.Exit");
			ch=sc.nextInt();
			
			switch(ch){
			
				case 1:
						System.out.println("Enter data to enqueue...");
						data=sc.nextInt();
						q.enQueue(data);
						break;
				case 2:
						int ele = q.deQueue();
						System.out.println("Dequeueed Element :"+ ele);
						break;
				case 3:
						q.display();
						break;
			}
		}while(ch!=0);
		
		
		
	}

}
