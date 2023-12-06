package com.linkedlist;

import com.stringlinkedlist.SNode;

public class LinkedList {

	Node head;

	public LinkedList() {
		head = null;
	}

	public void addNode(int data) {

		Node record = new Node(data);

		if (head == null) {
			head = record;
		} else {
			Node move;

			for (move = head; move.link != null; move = move.link);
			move.link = record;

		}
	}

	public void createLinkedList(int size) {

		
		
	}

	public void addBeg(int data) {

		Node record = new Node(data);

		if (head == null) {
			head = record;
		} else {
			record.link = head;
			head = record;
		}

	}

	public void printFirstNode() {
		if (head == null) {
			System.out.println("Empty StackLinkedList");
		} else {
			System.out.println(head.data);
		}
	}

	public void printLastNode() {
		Node move;
		for (move = head; move.link != null; move = move.link) {

		}
		if (move.link == null) {
			System.out.print(move.data);
		}
	}
	
	public void modifyNode(int position,int newNode) {
		
		
		Node move ;
		int count=0;
		for(move=head;move.link!=null;move=move.link) {
			count++;
			if(count==position){
				move.data = newNode;
				break;
			}
			
		}
		
	}
	
	public void modifyDataNode(int targetNode,int newSNode) {
		
		Node move;
		
		for(move=head;move.link!=null;move=move.link) {
			
			if(move.data==targetNode) {
				move.data = newSNode;
				break;
			}
			
		}
		
	}
	public int size() {
		Node move;
		int count = 0;
		System.out.println();
		for (move = head; move.link != null; move = move.link) {

			count++;
		}
		if (move.link == null) {
			count++;
		}

		return count;

	}
	
	public void insert(int pos,int data) {
		
	}

	public void display() {

		Node move;
		System.out.println();
		for (move = head; move.link != null; move = move.link) {
			System.out.print(move.data + " ");

		}
		if (move.link == null) {
			System.out.print(move.data);
			System.out.println();
		}
	}

}
