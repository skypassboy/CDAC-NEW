package com.CustomerQueue;

import java.util.Scanner;



public class CustomerDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of queue...");
		int size=sc.nextInt();
		CustomerQueue q = new CustomerQueue(size);
		int ch;
		String cname;
		int cno;
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
						System.out.println("Enter cname : ");
						cname=sc.next();
						System.out.println("Enter cno : ");
						cno=sc.nextInt();
						q.enQueue(new Customer(cname,cno));
						break;
				case 2:
					
						Customer ele =q.deQueue();
						if(ele!=null) {
							System.out.println("Dequeued Element : "+ ele);
						}
						else {
							System.out.println("Queue is empty");
						}
						break;
				case 3:
						q.display();
						break;
			}
		}while(ch!=0);
	}

}
