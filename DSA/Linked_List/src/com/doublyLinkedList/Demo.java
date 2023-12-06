package com.doublyLinkedList;

public class Demo {

	public static void main(String[] args) {
		
		
		LinkedList l1 = new LinkedList();
		l1.createDoublyLinkedList(5);
//		l1.addBeg(20);
//		l1.display();
//		l1.addBeg(30);
//		l1.display();
//		l1.insert(5, 500);
//		l1.display();
//		l1.printReverse();
//		System.out.println(l1.size());
//		l1.display();
//		l1.deletePos(8);
		l1.modidfy(1, 100);
		l1.modidfy(3, 300);
		l1.modidfy(5, 500);
		l1.display();

	}

}
