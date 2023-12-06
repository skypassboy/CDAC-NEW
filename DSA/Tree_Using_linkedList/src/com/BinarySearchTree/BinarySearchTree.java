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
		} else {
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
				} else if (n1.data > move.data) {
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

	}

	public boolean searchData(int data) {

		Node temp = root;

		while (temp != null && temp.data != data) {
			Node tag = temp;

			if (data > temp.data) {
				temp = temp.right;
			} else {
				temp = temp.left;
			}
		}

		if (temp.data == data) {
			return true;
		} else {
			return false;
		}

	}

	public void delete(int data) {
	    Node temp = root;
	    Node tag = null;
	    Node parent = null; // Keep track of the parent node

	    // Searching for data in the tree
	    while (temp != null && temp.data != data) {
	        tag=temp; // Update the parent

	        if (data > temp.data) {
	            tag = temp;
	            temp = temp.right;
	        } else {
	            tag = temp;
	            temp = temp.left;
	        }
	    }

	    // Data not found
	    if (temp == null) {
	        return;
	    }

	    // If left node is null...
	    if (temp.left == null) {
	        if (tag == null) {
	            // If the root node is deleted, update root
	            root = temp.right;
	        } else if (tag.data < temp.data) {
	            tag.right = temp.right;
	        } else {
	            tag.left = temp.right;
	        }
	    }
	    // If right node is null...
	    else if (temp.right == null) {
	        if (tag == null) {
	            // If the root node is deleted, update root
	            root = temp.left;
	        } else if (tag.data > temp.data) {
	            tag.left = temp.left;
	        } else {
	            tag.right = temp.left;
	        }
	    }
	    // If both left and right are not null...
	    else {
	        Node successorParent = temp;
	        Node successor = temp.right;

	        while (successor.left != null) {
	            successorParent = successor;
	            successor = successor.left;
	        }

	        temp.data = successor.data;

	        if (successorParent != temp) {
	            successorParent.left = successor.right;
	        } else {
	            successorParent.right = successor.right;
	        }
	    }
	}

	/*public void delete(int data) {
		Node temp = root;
		Node tag = null;
//	searching data in tree
		while (temp != null && temp.data != data) {
			tag = temp;

			if (data > temp.data)
				temp = temp.right;
			else
				temp = temp.left;

		}
//	end of search

//  if left node is null...
		if (temp.left == null) {
			if (tag.data < temp.data)
				tag.right = temp.right;
			else
				tag.left = temp.right;
		}

//	if right node is null...
		if (temp.right == null) {
			if (tag.data > temp.data) {
				tag.left = temp.left;
			}

			else {
				tag.right = temp.left;
			}
		}
//  if both left and right are not null...
		if (temp.left != null) {
			if (temp.right != null) {
				Node tr = temp.right;
				while (tr.left != null) {

					tr = tr.left;
				}
				tr.left = temp.left;

				if (tag.data < temp.data) {
					tag.right = temp.right;
				} else {
					tag.left = temp.right;
				}
			}
		}
	}*/


	public int highestElement() {
		Node tr = root;
		while (tr.right != null) {
			tr = tr.right;
		}
		return tr.data;
	}

	public int lowestElement() {
		Node tl = root;
		while (tl.left != null) {
			tl = tl.left;
		}
		return tl.data;
	}

	public int height(Node move) {

		if (move == null) {
			return -1;
		}
		int lh = height(move.left);
		int rh = height(move.right);
		return lh > rh ? lh + 1 : rh + 1;

	}

	public void levelWiseDisplay() {

		CQueue q = new CQueue();

		if (root == null) {
			System.out.println("tree is empty...!");
		} else {

			q.enQueue(root);
			while (!q.isEmpty()) {

				Node delEle = q.deQueue();
				System.out.print(delEle.data + " ");
				if (delEle.left != null) {
					q.enQueue(delEle.left);
				}
				if (delEle.right != null) {
					q.enQueue(delEle.right);
				}

			}
		}

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
			postOrder(move.left);
			postOrder(move.right);
			System.out.print(move.data + " ");
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
