package com.BinarySearchTree;

public class BinarySearchTree {

	Node root;

	public BinarySearchTree() {

		root = null;

	}

	public void addNode(int data) {

		Node n1 = new Node(data);

		if (root == null) {

			root = n1;
			System.out.println("Root created...!");
			return;
		}

		Node move = root;

		while (true) {

			if (move.data == n1.data) {

				System.out.println("Enter distinct data...!");
				return;

			} else if (n1.data < move.data) {

				if (move.left == null) {
					move.left = n1;
					System.out.println("Node added at left of " + move.data);
					break;
				} else {
					move = move.left;
				}

			}

			else {

				if (move.right == null) {
					move.right = n1;
					System.out.println("Node added at right of " + move.data);
					break;
				} else {
					move = move.right;
				}

			}

		}

	}

	public boolean searchData(int data) {
		Node move = root;

		while (move != null) {
			if (move.data == data) {
				return true; // Data found in the tree
			} else if (move.data < data) {
				move = move.right; // Move to the right subtree
			} else {
				move = move.left; // Move to the left subtree
			}
		}

		return false; // Data not found in the tree
	}

	public void delete(int data) {

		Node temp = root;
		Node tag = null;

		while (temp != null && temp.data != data) {

			tag = temp;

			if (data < temp.data) {
				temp = temp.left;
			} else {
				temp = temp.right;
			}

		}

		if (temp == null) {
			return;
		}

		if (temp.left == null) {

			if (tag == null) {
				root = temp.right;
			} else if (temp.data < tag.data) {
				tag.left = temp.right;
			} else {
				tag.right = temp.right;
			}

		}
		
		else if(temp.right == null) {
			
			if(tag==null) {
				root = temp.left;
			}
			else if(temp.data<tag.data) {
				tag.left = temp.left;
			}
			else {
				tag.right = temp.left;
			}
		}
		else {
			
			Node successorParent = temp;
			Node successor = temp.right;
			
			if(successor.left!=null) {
				successorParent = successor;
				successor = successor.left;
			}
			temp.data = successor.data;
			
			if(successorParent==temp) {
				successorParent.right = successor.right;
			}
			else {
				successorParent.left = successor.right;
			}
			
		}

	}
	
	public int height(Node move) {
		
		if(move==null) {
			return -1;
		}
		
		int lh = height(move.left);
		int rh = height(move.right);
		
		int height = lh>rh ? lh+1 : rh+1;
		
		return height;
		
	}
	
	public void inOrder(Node move) {

		if (move != null) {
			inOrder(move.left);
			System.out.print(move.data + " ");
			inOrder(move.right);
		}

	}

	public void preOrder(Node move) {
		if (move != null) {
			System.out.print(move.data + " ");
			preOrder(move.left);
			preOrder(move.right);
		}
	}

	public void postOrder(Node move) {
		if (move != null) {

			preOrder(move.left);
			postOrder(move.right);
			System.out.print(move.data + " ");
		}
	}

	public void display() {

		System.out.print("inOrder : ");
		inOrder(root);
		System.out.println();

		System.out.print("preOrder : ");
		preOrder(root);
		System.out.println();

		System.out.print("postOrder : ");
		postOrder(root);
		System.out.println();
	}

}
