package com.knowit;

public class EmpDemo {

	public static void main(String[] args) {
		
		
		Person p1 = new Person("ritesh",new Date(22,12,23));
		p1.display();
		System.out.println("*********************");
		
		Person p2 = new Emp("Atharv",new Date(22,12,2023),101,20000);
		p2.display();
		
		System.out.println("*********************");
		Emp e1 = new Emp("Ram",new Date(22,12,2023),101,20000);
		e1.display();
	}

}
