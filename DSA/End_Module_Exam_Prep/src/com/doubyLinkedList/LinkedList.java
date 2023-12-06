package com.doubyLinkedList;

public class LinkedList {
	
	Node head;
	
	public LinkedList() {
		head=null;
	}
	
	public void addNode(int data) {
		
		Node n1 = new Node(data);

		if(head==null) {
			head = n1;
			return;
		}
		
		Node move = head;
		
		while(move.next!=null) {
			move= move.next;
		}
		move.next = n1;
		n1.prev = move;
		
	}
	
	public int size() {
		
		Node move = head;
		int cnt = 0;
		while(move!=null) {
			cnt++;
			move = move.next;
		}
		return cnt;
	}
	
	public void deleteByPosition(int pos) {
		
		if(head==null) {
			System.out.println("Empty linked list...!");
		}
		else {
			
			if(pos>=1 || pos<=size()) {
				
				Node move = head;
				
				if(pos==1) {
					head=move.next;
					move.next = null;
					head.prev = null;
				}
				else if(pos==size()) {
					
					while(move.next.next!=null) {
						move=move.next;
					}
					Node del = move.next;
					move.next = null;
					del =null;
				}
				else {
					for(int i=1;i<pos-1;i++) {
						move = move.next;
					}
					Node del = move.next;
					move.next  = del.next;
					del=null;
					
				}

				
			}
			
			
		}
		
		
		
	}
	
	
	
	public void printReverse() {
		
		Node move = head;
		
		while(move.next!=null) {
			move = move.next;
		}
		
		System.out.println();
		while(move.prev!=null) {
			System.out.print(move.data+" ");
			move = move.prev;
		}
		System.out.print(move.data+" ");
		
		
		
	}
	public void display() {
		
		Node move = head;
		System.out.println();

		while(move!=null) {
			System.out.print(move.data+" ");
			move = move.next;
		}
		
	}
	
	
	
}
