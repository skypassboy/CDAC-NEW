package com.assignment5;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack s1 = new Stack(3);
		try {
			s1.push(10);
			s1.push(20);
//			s1.push(30);
			s1.push(30);
			System.out.println(s1.toString());
			s1.push(40);
//			s1.push(50);
			System.out.println(s1.toString());
		} catch (StackOverFlowException e) {
			
			System.out.println(e.getMsg());
		}
		Stack s2 = new Stack(3);
		try {
			
			System.out.println(s2.pop());
			
		} catch (StackUnderFlowException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMsg());
		}
		
		
	}

}
