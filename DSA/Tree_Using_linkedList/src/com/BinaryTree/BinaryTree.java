package com.BinaryTree;

import java.util.Scanner;

public class BinaryTree {
		
	Node root;
	public BinaryTree() {
		root=null;
	}
	
	public void addNode(int data) {
		Node n1 = new Node(data);
		Scanner sc = new Scanner(System.in);
		if(root==null) {
			root=n1;
			System.out.println("Root created...!");
			return;
		}
		int ch;
		Node move = root;
		while(true) {
			System.out.println("where to attach of "+ move.data);
			System.out.println("1.Left");
			System.out.println("0.Right");
			ch = sc.nextInt();
			if(ch==1) {
				if(move.left==null) {
					move.left = n1;
					System.out.println("Node added at left of "+move.data);
					break;
				}
				else {
					move = move.left;
				}
			}
			if(ch==0) {
				if(move.right ==null) {
					move.right=n1;
					System.out.println("Node added at right of "+move.data);
					break;
				}
				else {
					move =move.right;
				}
			}
		}
	}
	
	public void inOrder(Node move) {
		
		if(move!=null) {
			inOrder(move.left);
			System.out.print(move.data+" ");
			inOrder(move.right);
		}

	}
	public void preOrder(Node move) {
		
		if(move!=null) {
			System.out.print(move.data+" ");
			preOrder(move.left);
			preOrder(move.right);
		}

	}
	public void postOrder(Node move) {
		
		if(move!=null) {
			postOrder(move.left);
			postOrder(move.right);
			System.out.print(move.data+" ");
		}

	}
	
	public void display() {
		
		System.out.println();
		System.out.println("In-Order");
		inOrder(root);
		
		System.out.println();
		System.out.println("Pre-Order");
		preOrder(root);
		
		System.out.println();
		System.out.println("post-Order");
		postOrder(root);
		System.out.println();
		
	}
	
	
}
