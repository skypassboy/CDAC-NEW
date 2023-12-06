package com.doubyLinkedList;

public class Demo {

	public static void main(String[] args) {
		
		
		LinkedList l1 = new LinkedList();
		l1.addNode(10);
		l1.addNode(20);
		l1.addNode(30);
		l1.addNode(40);
		l1.addNode(50);
		l1.display();
		l1.deleteByPosition(5);
		l1.display();
		l1.printReverse();
	}

}
