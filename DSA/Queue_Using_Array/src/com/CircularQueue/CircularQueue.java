package com.CircularQueue;

public class CircularQueue {

	private int arr[];
	private int size;
	private int rear;
	private int front;

	public CircularQueue() {

		this.size = 3;
		arr = new int[size];
		rear = front = -1;

	}

	public CircularQueue(int size) {

		this.size = size;
		arr = new int[size];
		rear = front = -1;

	}

	public boolean isEmpty() {

		if (front == -1) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isFull() {

		if (front == (rear +1)%size) {
			return true;
		} else {
			return false;
		}
	}

	public void enQueue(int data) {

		if (!isFull()) {

			if (front == -1) {
				front = 0;
			}
			rear = (rear + 1) % size;
			arr[rear] = data;
			System.out.println("rear---> " + rear);
			System.out.println("front---> " + front);
		} else {
			System.out.println("Queue is full...!");
		}

	}

	public int deQueue() {

		int data = -9999;
		if (!isEmpty()) {
			data = arr[front];

			if (front == rear) {
				front = rear = -1;
			} else {
				front = (front + 1) % size;
				System.out.println("front---> " + front);
			}

		}
		return data;

	}

	public void display() {

		if (!isEmpty()) {
			int i;
			for (i = front; i != rear; i = (i + 1) % size) {
				System.out.println(arr[i]);
			}
			if (i == rear) {
				System.out.println(arr[i]);
			}
		} else {
			System.out.println("Queue is Empty...!");
		}
	}

}
