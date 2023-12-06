package com.userDefinedLinkedList;

import java.util.Scanner;

public class LinkedList {

	private Node head;

	public LinkedList() {
		this.head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void addNode(Employee data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {

			Node move = head;

			while (move.getNext() != null) {
				move = move.getNext();
			}

			move.setNext(newNode);

		}

	}
	
	public void createLinkedList(int size) {

		Scanner sc  = new Scanner(System.in);
		
		
		for (int i = 1; i <= size; i++) {
			System.out.println("Enter element : " + i);
			System.out.println("Enter Employee Name : ");
			String ename = sc.next();
			System.out.println("Enter Employee no :");
			int eno = sc.nextInt();
			addNode(new Employee(eno,ename));
		}
		display();
	}
	
	public void display() {

		Node move;
		System.out.println();
		for (move = head; move.getNext() != null; move = move.getNext()) {
			System.out.print(move.getData() + " ");

		}
		if (move.getNext() == null) {
			System.out.print(move.getData());
			System.out.println();
		}
	}

}
