package com.CircularQueue;

import java.util.Scanner;

import com.queue.cQueue;

public class CircularQueueDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of queue...");
		int size=sc.nextInt();
		CircularQueue q = new CircularQueue(size);
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
						if(q.deQueue()!=-9999) {
							System.out.println("Dequeued Element : "+ q.deQueue());
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
