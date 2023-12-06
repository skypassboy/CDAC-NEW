package com.assignment5;


import java.util.Set;
import java.util.TreeSet;

public class EmpDemo {

	public static void main(String[] args) {

		
		Set<Emp> emps = new TreeSet<Emp>(new ComparatorEmp());
		
		
		emps.add(new Emp("Ritesh", 101, 1, 200000d));
		emps.add(new Emp("Anup", 102, 2, 50000d));
		emps.add(new Emp("Raghu", 103, 2, 70000d));
		emps.add(new Emp("Chiru", 104, 3, 80000d));
		emps.add(new Emp("Gaurav", 105, 4, 80000d));
		emps.add(new Emp("Raghu", 106, 1, 70000d));
		
		for(Emp e : emps) {
			System.out.println(e);
		}
		
	}

}
