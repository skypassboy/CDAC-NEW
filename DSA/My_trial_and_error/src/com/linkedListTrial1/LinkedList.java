package com.linkedListTrial1;



public class LinkedList {
	
	Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public void addNode(int data) {
		
		Node n1 = new Node(data);
		
		if(head==null) {
			head = n1;
		}
		else {
			
			Node move = head;
			
			while(move.next!=null) {
				
				move = move.next;
				
			}
			
			move.next = n1;
			
		}
		
	}
	
	public void addBeg(int data) {
		
		Node n1 = new Node(data);
		
		if(head==null) {
			head=n1;
		}
		else {
			n1.next = head;
			head=n1;
		}
	
	}
	
	public float average() {
		
		float sum=0;
		float count=0;
		Node move = head;
		
		while(move!=null) {
			sum=sum+move.data;
			count++;
			move = move.next;
		}
		
		return sum/count;
		
	}
	
	public int min() {
		
		Node move = head;
		int min = move.data;
		while(move!=null) {
			if(min>move.data) {
				min=move.data;
			}
			move = move.next;
		}
		return min;
	}
	
	public int max() {
		
		Node move = head;
		int max = move.data;
		while(move!=null) {
			if(max<move.data) {
				max=move.data;
			}
			move = move.next;
		}
		return max;
	}
	public int size() {
		
		Node move = head;
		
		int count=1;
		
		while(move.next!=null) {
			count++;
			move = move.next;
		}
		return count;
	}
	public void leftShift(int key) {
		
		System.out.println();
		if(key<1 || key>size()) {
			System.out.println("Invalid key...!");
		}
		else {
			Node move = head;
			for(int i=1;i<key;i++) {
				move = move.next;
			}
			Node move1 = head;
			
			while(move1.next!= null) {
				move1 = move1.next;
			}
			move1.next = head;
			head = move.next;
			move.next = null;
		}
	}
	
	public void sort() {
		
		Node temp = head;
		while(temp!=null) {
			
			Node tag = temp.next;
			
			while(tag!=null) {
				
				if(temp.data>tag.data) {
					int ele = temp.data;
					temp.data = tag.data;
					tag.data = ele;
				}
				tag = tag.next;
			}
			temp = temp.next;
		}
		
	}
	
	public void reverse() {
		
		if(head==null || head.next==null) {
			return;
		}
			Node p1 = head;
			Node p2 = p1.next;
			head.next = null;
			
			while(p2!=null) {
				Node p3 = p2.next;
				
				p2.next = p1;
				p1=p2;
				p2=p3;
			}
			head = p1;
	
	}
	
	public int findMid() {
		Node fast = head;
		Node slow = head;
		if(head==null) {
			System.out.println("Empty...!");
		}
		
			
			
			while(fast!=null && fast.next!=null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			
		
		return slow.data;
		
	}
	
	public void deleteBeg() {
		
		if(head==null) {
			System.out.println("Empty...!");
		}
		else {
			
			Node del = head;
			
			head = del.next;
			del=null;
			
			
			
		}
		
		
	}
	
	
	public int deleteEnd() {
		
		if(head==null) {
			System.out.println("Empty...!");
			return -1;
		}
		else {
			int del ;
			Node move = head;
		
			while(move.next.next!=null) {
				
				move = move.next;
				
			}
			del = move.next.data;
			move.next = null;
			return del;
		}
		
	}
	public void deleteNode(int ele) {

		boolean flag = false;
		Node del;

		if (head.data == ele) {
			del = head;
			head = head.next;
			del = null;
			flag = true;
			return;
		} else {
			Node move = head;
			while (move.next != null) {
				if (move.next.data == ele) {
					del = move.next;
					move.next = del.next;
					del = null;
					flag = true;
					break;
				}
				move = move.next;
			}
			if (flag == false) {
				System.out.println("not present");
			}
		}

	}
	public void segregateEvenOdd() {
		
		Node move = head;
//		Node move1 = head;
		while(move.next!=null) {
			if(move.next.data%2!=0) {
				int add  = move.next.data;
				deleteNode(move.next.data);
				addNode(add);
			}
			move = move.next;
		}
		
	}
	public void trim(int from,int upto) {
		
		
		
	}
	
	public void display() {
		
		Node move = head;
		System.out.println();
		while(move!=null) {
			System.out.print(move.data+" ");
			move=move.next;
		}
	 
		
	}
	
	
	
}
