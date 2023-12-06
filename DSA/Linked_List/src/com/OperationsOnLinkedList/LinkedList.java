package com.OperationsOnLinkedList;

import java.util.Scanner;

public class LinkedList {
	Node head;

	Scanner sc = new Scanner(System.in);

	public LinkedList() {
		head = null;
	}

	public void addNode(int data) {

		Node record = new Node(data);

		if (head == null) {
			head = record;
		} else {
			Node move;

			for (move = head; move.next != null; move = move.next)
				;
			move.next = record;

		}
	}

	public void createLinkedList(int size) {

		for (int i = 1; i <= size; i++) {
			System.out.println("Enter element : " + i);
			int data = sc.nextInt();
			addNode(data);
		}
		display();
	}

	public void addBeg(int data) {

		Node record = new Node(data);

		if (head == null) {
			head = record;
		} else {
			record.next = head;
			head = record;
		}

	}

	public void sort() {

		Node temp = head;

		while (temp != null) {
			Node tag = temp.next;
			while (tag != null) {
				if (temp.data > tag.data) {
					int ele = temp.data;
					temp.data = tag.data;
					tag.data = ele;
				}
				tag = tag.next;
			}
			temp = temp.next;
		}
	}

	public void printFirstNode() {
		if (head == null) {
			System.out.println("Empty StackLinkedList");
		} else {
			System.out.println(head.data);
		}
	}

	public void printLastNode() {
		Node move;
		for (move = head; move.next != null; move = move.next) {

		}
		if (move.next == null) {
			System.out.print(move.data);
		}
	}

	public void modifyNode(int position, int newData) {

		int count = 1;

		if (head == null) {
			System.out.println("Empty linkedlist...!");
		} else {
			Node move = head;

			while (move != null) {

				if (count == position) {
					move.data = newData;
					break;
				}
				move = move.next;
				count++;
			}
		}

	}

	public void modifyDataNode(int targetNode, int newSNode) {

		Node move;

		for (move = head; move.next != null; move = move.next) {

			if (move.data == targetNode) {
				move.data = newSNode;
				break;
			}

		}

	}

	public int size() {
		int count = 0;
		if (head == null) {
			System.out.println("Empty...!");
		} else {
			Node move = head;

			while (move != null) {
				move = move.next;
				count++;
			}
		}
		return count;
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

	public boolean deleteNodeByPosition(int position) {
		if (head == null) {
			System.out.println("List is empty.");
			return false;
		}

		if (position == 1) {
			head = head.next;
			return true;
		}

		int currentPosition = 1;
		Node current = head;

		while (current.next != null && currentPosition < position - 1) {
			current = current.next;
			currentPosition++;
		}

		if (current.next == null || currentPosition < position - 1) {
			System.out.println("Position " + position + " is out of bounds.");
			return false;
		}

		current.next = current.next.next;
		return true;
	}

	public void reverseLinkedList() {

		if (head == null || head.next == null) {
			return;
		}
		Node p1 = head;
		Node p2 = p1.next;
		head.next = null;
		while (p2 != null) {
			Node p3 = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = p3;

		}
		head = p1;
	}

	public void insertNode(int pos, int data) {

		int cnt = size();
		if (pos <= cnt + 1) {
			Node newnode = new Node(data);
			if (pos == 1) {
				if (head == null) {
					head = newnode;
				} else {
					newnode.next = head;
					head = newnode;
				}
			} else {
				Node move = head;
				for (int i = 1; i < pos - 1; i++) {
					move = move.next;
				}
				newnode.next = move.next;
				move.next = newnode;
			}
		}

	}

	public void insertAfterData(int dataToFind, int dataToInsert) {
		Node newNode = new Node(dataToInsert);
		if (head == null) {
			System.out.println("The list is empty.");
			return;
		}

		Node current = head;
		while (current != null) {
			if (current.data == dataToFind) {
				newNode.next = current.next;
				current.next = newNode;
				return;
			}
			current = current.next;
		}

		System.out.println(dataToFind + " not found in the list.");
	}

	public void merge(LinkedList listToMerge) {
		if (listToMerge == null || listToMerge.head == null) {
			return; // Nothing to merge
		}

		if (head == null) {
			head = listToMerge.head;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = listToMerge.head;
		}
	}

	public void SplitLinkedList(LinkedList LLToSplit) {

		LinkedList odd = new LinkedList();
		LinkedList even = new LinkedList();

		if (LLToSplit.head == null) {
			System.out.println("Empty StackLinkedList...!");
		} else {
			Node move = LLToSplit.head;

			while (move != null) {
				if (move.data % 2 == 0) {
					even.addNode(move.data);
				} else {
					odd.addNode(move.data);
				}
				move = move.next;

			}
			LLToSplit.display();
			odd.display();
			even.display();

		}

	}

	public Node findMiddle() {
		if (head == null) {
			return null; // The list is empty
		}

		Node slowPointer = head;
		Node fastPointer = head;

		while (fastPointer != null && fastPointer.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}

		return slowPointer;
	}

	public void displayReverse() {
		if (head == null) {
			System.out.println("Empty linked list...!");
		} else {
			displayReverseRecursive(head);
		}
	}

	public void displayReverseRecursive(Node node) {
		if (node == null) {
			return;
		}

		// Recursively call the next node
		displayReverseRecursive(node.next);

		// Print the current node's data
		System.out.print(node.data + " ");
	}

	public void display() {

		Node move;
		System.out.println();
		for (move = head; move.next != null; move = move.next) {
			System.out.print(move.data + " ");

		}
		if (move.next == null) {
			System.out.print(move.data);
			System.out.println();
		}
	}
}
