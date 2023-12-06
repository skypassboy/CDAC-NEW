package com.doublyLinkedList;

import java.util.Scanner;

public class LinkedList {
	
	Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public void createDoublyLinkedList(int size) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= size; i++) {
			System.out.println("Enter element : " + i);
			int data = sc.nextInt();
			addNode(data);
		}
		display();
	
	}
	
	public void addNode(int data) {
		
		Node n1 = new Node(data);
		
		if(head==null) {
			head=n1;
		}
		else {
			Node move = head;
			
			while(move.next!=null) {
				move = move.next;
			}
			
			move.next = n1;
			n1.prev = move;
		}
		
	}
	
	public void addBeg(int data) {
		
		Node n1  = new Node(data);
		
		if(head ==null) {
			head = n1;
		}
		else {
			n1.next = head;
			head.prev = n1;
			head = n1;
			
		}
		
	}
	
	public int size() {
	
		System.out.println();
		if(head == null) {
			System.out.println("Empty...!");
		}
		else {
			Node move = head;
			int count = 0;
			while(move!= null) {
				count++;
				move = move.next;
			}
			return count;
		}
		return -1;
	}
	
	public void insert(int pos,int data) {
		
		if(pos<=0 || pos>size()+1) {
			return;
		}
		
		Node n1 = new Node(data);
		
		if(pos==1) {
			if(head==null) {
				head = n1;
			}
			else {
				addBeg(data);
			}
		}
		else if(pos==size()) {
			if(head==null) {
				head = n1;
			}else {
				addNode(data);
			}
			
		}
		else {
			Node move = head;
			
			for( int i=1;i<pos-1;i++) {
				move = move.next;
			}
			
			n1.next = move.next;
			move.next.prev = n1;
			move.next = n1;
			n1.prev = move;
			
		}
	
	}
	
	public void modidfy(int pos, int ele) {
		
		if(pos<=0 || pos>size()) {
			return;
		}
		else {
			Node move = head;
			
			for(int i=1;i<pos;i++) {
				move=move.next;
			}
			
			move.data = ele;
		}
		
	}
	
	public void deletePos(int pos) {
		if(pos==1) {
			if(head.next==null) {
				head=null;
			}
			else {
				head.next.prev = null;
				head = head.next;
			}
		}
		else {
			Node move = head;
			for(int i = 1;i<pos-1;i++) {
				move = move.next;
			}
			Node del = move.next;
			if(del.next!=null) {
				del.next.prev = move;
			}
			move.next = del.next;
			del = null;
			
		}
	}
	
	public void printReverse() {
		
		System.out.println();
		if(head==null) {
			System.out.println("Empty...!");
		}
		else {
			Node move = head;
			
			while(move.next!=null) 
				move = move.next;
			while(move!=null)
			{
				System.out.print(move.data+" ");
				move=move.prev;
			}
		}
		
	}
	public void display() {
		
		if(head==null) {
			System.out.println("Empty DoublyLinkedList...!");
		}
		else {
			
			Node move = head;
			System.out.println();
			while(move!= null) {
				System.out.print(move.data+" ");
				move = move.next;
			}
			
		}
		
	}
	
}
