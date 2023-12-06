package com.linkedListTrial1;

public class Demo {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		
		l1.addNode(70);
		l1.addNode(23);
		l1.addNode(98);
		l1.addNode(33);
		l1.addNode(50);
		l1.addBeg(700);
		l1.addNode(523);
//		l1.display();
//		l1.deleteEnd();
//		l1.deleteBeg();
//		l1.addNode(200);
//		System.out.println(l1.findMid());
//		l1.sort();
//		l1.reverse();
		l1.display();
		
		l1.segregateEvenOdd();
//		l1.leftShift(2);
		l1.display();
 
	}

}
