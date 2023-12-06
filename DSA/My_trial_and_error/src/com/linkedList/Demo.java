package com.linkedList;

public class Demo {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		l1.addNode(10);
		l1.addNode(20);
		l1.addNode(30);
		l1.display();
		l1.addBeg(122);
		l1.addBeg(111);
		l1.addBeg(123);
		l1.display();
		l1.printFirstNode();
//		l1.printLastNode();
		l1.modifyNode(1, 60);
		l1.modifyDataNode(30, 120);
		l1.display();
//		l1.displayReverse();
		System.out.println(l1.size());
		

	}

}
