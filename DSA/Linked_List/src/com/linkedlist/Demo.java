package com.linkedlist;

public class Demo {

	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		l1.addNode(12);
		l1.addNode(18);
		l1.addNode(17);
		l1.addNode(16);
		l1.display();
		l1.modifyNode(2, 100);
		l1.display();
		l1.modifyDataNode(100, 1);
		l1.display();

		
	}

}
