package com.stringlinkedlist;

public class SDemo {

	public static void main(String[] args) {
		
		SLinkedList l1 = new SLinkedList();
		
		l1.addSNode("Ritesh");
		l1.addSNode("Anup");
		l1.addSNode("ASP");
		l1.display();
		l1.modifyNode("Ritesh", "Gaurav");
		l1.display();
		
	}

}
