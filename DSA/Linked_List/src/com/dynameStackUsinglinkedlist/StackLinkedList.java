package com.dynameStackUsinglinkedlist;

public class StackLinkedList {
	
	
	 private Node top; // The top of the stack

	    public StackLinkedList() {
	        top = null;
	    }

	    // Check if the stack is empty
	    public boolean isEmpty() {
	        return top == null;
	    }

	    // Push an element onto the stack
	    public void push(int data) {
	        Node newNode = new Node(data);
	        newNode.next = top;
	        top = newNode;
	        
	        Node move = top;
	        
	        System.out.println();
	        while(move!=null) {
	        	System.out.println(move.data+" ");
	        	move = move.next;
	        }
	        
	        
	    }

	    // Pop an element from the stack
	    public int pop() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Stack is empty");
	        }
	        int data = top.data;
	        top = top.next;
	        Node move = top;
	        System.out.println();
	        while(move!=null) {
	        	System.out.println(move.data+" ");
	        	move = move.next;
	        }
	        return data;
	    }

	    // Peek at the top element without removing it
	    public int peek() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Stack is empty");
	        }
	        return top.data;
	    }

	
	
}
