package com.BinarySearchTree;

public class CQueue {
	QNode front, rear;

	public CQueue() {
		front = rear = null;
	}

	public boolean isEmpty() {
		return rear == null ? true : false;
	}

	public void enQueue(Node data) {
		QNode n1 = new QNode(data);
		if (rear == null) {
			rear = front = n1;
		} else {
			rear.next = n1;
			rear = n1;
		}
	}

	public Node deQueue() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty...!");
		}
		Node data;
		data = front.data;
		front = front.next;
		 if (front == null) {
		        // If front is now null, the queue is empty, so set rear to null as well.
		        rear = null;
		    }
		return data;
	}

	public String toString() {

		String str = " ";
		QNode move = front;
		while (move != rear) {
			str = str + move.data + " ";
			move = move.next;
		}
		str = str + move.data;
		return str;

	}
}
