package com.singlyCircularLinkedList;

public class Demo {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		
		l1.addNode(12);
		l1.addNode(13);
		l1.addNode(16);
		l1.addNode(17);
//		l1.addBeg(100);
//		l1.addMid(6, 700);
//		l1.display();
//		l1.deleteBeg();
//		l1.display();
//		l1.deleteEnd();
		l1.display();
		l1.deleteMid(4);
		l1.display();
		System.out.println(l1.size());;

	}

}
