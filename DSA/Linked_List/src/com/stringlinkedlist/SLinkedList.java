package com.stringlinkedlist;

import com.linkedlist.Node;

public class SLinkedList {
	
	SNode head;

	public SLinkedList() {
		super();
		head=null;
	}
	
	public void addSNode(String data) {
		
		SNode record = new SNode(data);
		
		if(head==null) {
			head = record;
		}
		else {
			SNode move;
			for(move=head;move.next!=null;move=move.next);
			move.next=record;
		}
		
	}
	
	public void modifyNode(String targetNode,String newSNode) {
		
		SNode move;
		
		for(move=head;move.next!=null;move=move.next) {
			
			if(move.data.equals(targetNode)) {
				move.data = newSNode;
				break;
			}
			
		}
		
	}
	
	public void modifyNode(int position,String newNode) {
		
		
		SNode move ;
		int count=0;
		for(move=head;move.next!=null;move=move.next) {
			count++;
			if(count==position){
				move.data = newNode;
				break;
			}
			
		}
		
	}

	public void addBeg(String data) {
		
		SNode record = new SNode(data);
		
		if(head==null) {
			head=record;
		}
		else {
			record.next= head;
			head=record;
		}

	}
	
	public int size() {
		SNode move;
		int count = 0;
		System.out.println();
		for (move = head; move.next != null; move = move.next) {

			count++;
		}
		if (move.next == null) {
			count++;
		}

		return count;

	}
	
	public void printFirstNode() {
		if (head == null) {
			System.out.println("Empty StackLinkedList");
		} else {
			System.out.println(head.data);
		}
	}

	public void printLastNode() {
		SNode move;
		for (move = head; move.next != null; move = move.next) {

		}
		if (move.next == null) {
			System.out.print(move.data);
		}
	}
	public void display() {
		
		
		SNode move;
		System.out.println();
		for(move=head;move.next!=null;move=move.next) {
			
			System.out.print(move.data+" ");
		
		}
		if(move.next==null) {
			
			System.out.println(move.data);
			
		}
		
		
	}
	
}
