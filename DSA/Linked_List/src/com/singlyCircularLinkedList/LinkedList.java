package com.singlyCircularLinkedList;

public class LinkedList {

	Node head;

	public LinkedList() {
		head = null;
	}

	public void addNode(int data) {

		Node n1 = new Node(data);

		if (head == null) {
			head = n1;
			n1.next = head;
		} else {

			Node move = head;

			while (move.next != head) {
				move = move.next;
			}

			move.next = n1;
			n1.next = head;

		}
	}

	public void addBeg(int data) {

		Node n1 = new Node(data);

		Node move = head;

		if (head == null) {
			head = n1;
			n1.next = head;
		} else {

			while (move.next != head) {
				move = move.next;
			}

			n1.next = head;
			head = n1;
			move.next = n1;

		}

	}

	public void addMid(int pos, int data) {

		Node n1 = new Node(data);

		if (pos <= 0 || pos > size() + 1) {
			return;
		} else {
			if (pos == 1) {
				if (head == null) {
					head = n1;
				} else {
					addBeg(data);
				}
			} else if (pos == size() + 1) {
				if (head == null) {
					head = n1;
				} else {
					addNode(data);
				}
			} else {

				Node move = head;

				for (int i = 1; i < pos - 1; i++) {
					move = move.next;
				}

				n1.next = move.next;
				move.next = n1;

			}
		}

	}

	public void deleteBeg() {

		if (head == null) {
			System.out.println("Empty...!");
		} else if (head.next == head) {
			head = null;
		} else {
			Node del = head;

			Node move = head;
			while (move.next != head) {
				move = move.next;
			}

			head = head.next;
			move.next = head;
			del = null;
		}

	}

	public void deleteEnd() {
		if (head == null) {
			System.out.println("Empty...!");
		} else if (head.next == head) {
			head = null;
		} else {
			

			Node move = head;
			Node move1 = head;
			while (move.next != head) {
				move = move.next;
			}
			
			for(int i=1;i<size()-1;i++) {
				move1 = move1.next;
			}
			move1.next = head;
			move.next = null;
			
		}
	}
	
	public void deleteMid(int pos) {
		
		if(pos<0||pos>size()) {
			System.out.println("Invalid position...!");
			return;
		}
		else {
			if(pos==1) {
				deleteBeg();
			}
			else if(pos==size()) {
				deleteEnd();
			}
			else {
				
				Node del=head;
				
				Node move = head;
				
				for(int i=1;i<pos;i++) {
					del = del.next;
				}
				for(int i=1;i<pos-1;i++) {
					move = move.next;
				}
				
				move.next = del.next;
				del = null;
				
			}
		}
		
	}

	public int size() {

		System.out.println();
		Node move = head;
		int count = 1;
		if (head == null) {
			System.out.println("Empty..!");
			count = 0;
		} else {
			while (move.next != head) {
				count++;
				move = move.next;
			}
		}
		return count;

	}

	public void display() {

		if (head == null) {
			System.out.println("Empty...!");
		} else {
			System.out.println();
			Node move = head;
			while (move.next != head) {
				System.out.print(move.data + " ");
				move = move.next;
			}
			System.out.print(move.data);
		}

	}

}
