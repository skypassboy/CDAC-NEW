package com.stack;

public class CStackDemo {

	public static void main(String[] args) {

		try {
			CStack s1 = new CStack(5);
			s1.display();
			s1.push(1);
			s1.push(2);
			s1.push(3);
			s1.display();
			s1.pop();
			s1.display();
			s1.pop();
			s1.display();
			s1.pop();
			s1.pop();
			s1.display();
		} catch (Exception e) {
			System.out.println();
			System.out.println(e.getMessage());;
		}

	}

}
