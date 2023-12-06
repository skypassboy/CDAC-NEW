package com.linkedList;

public class LinkedList {

	Node head;

	public LinkedList() {

		this.head = null;
	}

	public void addNode(int data) {

		Node current = new Node(data);

		if (head == null) {
			head = current;
		} else {

			Node move = head;
			while (move.next != null) {

				move = move.next;
			}

			move.next = current;
		}

	}

	public void addBeg(int data) {

		Node current = new Node(data);

		if (head == null) {
			head = current;
		} else {
			current.next = head;
			head = current;
		}

	}

	public void display() {

		Node move = head;
		System.out.println();
		while (move != null) {

			System.out.print(move.data + " ");
//		 System.out.println("**********************");
//		  System.out.println(move);
			move = move.next;

		}

	}

	public void printFirstNode() {

		System.out.println();
		if (head == null) {
			System.out.println("Linkedlist is empty...!");
		} else {
			System.out.println(head.data);
		}

	}

	public void printLastNode() {

		System.out.println();
		if (head == null) {
			System.out.println("Linkedlist is empty...!");
		} else {
			
			Node move = head;
			
			while(move.next!=null) {
				move=move.next;
			}
			System.out.println(move.data);
			
		}

	}
	
	public void modifyNode(int position,int newData) {
		
		int count = 1;
		
		
		if(head==null) {
			System.out.println("Empty linkedlist...!");
		}
		else {
			Node move = head;
			
			while(move!=null) {
				
				if(count==position) {
					move.data = newData;
					break;
				}
				move= move.next;
				count++;
			}	
		}

	}
	public void modifyDataNode(int targetNode,int newData) {
		
		if(head==null) {
			System.out.println("empty linkedlist...!");
		}
		else {
			Node move = head;
			
			while(move!=null) {
				if(move.data==targetNode) {
					move.data = newData;
					break;
				}
				move = move.next;
			}
			
		}
		
	}
	public void insertNode(int pos,int data) {
		
		Node current = new Node(data);
		int count = size();
		if(pos<=count+1) {
			
			if(pos==1) {
				if(head==null) {
					head=current;
				}
				else {
					current.next=head;
					head=current;
				}
			}
			else {
				Node move = head;
				for(int i=1;i<pos-1;i++) {
					move=move.next;
				}
				current.next=move.next;
				move.next=current;
			}
		}
		
	}
	
	public void deleteNode(int ele) {
			
	}
	
	public int size() {
		
		int count = 0;
		if(head==null) {
			System.out.println("Empty...!");
		}
		else {
			Node move = head;
			
			while(move!= null) {
				move=move.next;
				count++;
			}
		}
		return count;
		
	}

	
	

}
