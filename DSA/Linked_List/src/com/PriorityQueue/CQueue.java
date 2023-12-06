package com.PriorityQueue;

public class CQueue {
	
	int size,front,rear;
	Element arr[];
	
	public CQueue(int size) {
		this.size = size;
		rear = front = -1;
		arr = new Element[size];
	}
	
	public boolean isEmpty() {
  	  
  	  if(front==-1) {
  		  return true;
  	  }
  	  else {
  		  return false;
  	  }
  	  
    }
    
    public boolean isFull() {
  	  
  	  if(rear == size-1) {
  		  return true;
  	  }
  	  else {
  		  return false;
  	  }
    }
	
	
	public void enQueue(Element data) {
		if(isFull()) {
			 throw new IllegalStateException("Queue is full...!");
		}
		if(front==-1) {
			front=0;
		}
		rear=rear+1;
		arr[rear] = data;
		
		for(int i=0;i<=rear;i++) {
			for(int j=0;j<rear-i;j++) {
				if(arr[j].pri<arr[j+1].pri) {
					Element temp;
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
//		System.out.println(data.toString());
	}
	
	public Element deQueue() {
		Element data =null;
		if(isEmpty()) {
			throw new IllegalStateException("Queue is Empty...!");
		}
		data = arr[front];
		if(front==rear) {
			front = rear = -1;
		}
		else {
			front++;
		}
		return data;
	}
	
	public void display() {
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].toString());
		}
		
	}
	
	
}
