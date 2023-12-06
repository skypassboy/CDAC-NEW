package com.assignment2;

import java.util.Set;
import java.util.TreeSet;

public class EmpDemo {

	public static void main(String[] args) {
		
		Set<Emp> emps = new TreeSet<Emp>();
		
		emps.add(new Emp("Ritesh", 1000d));
		emps.add(new Emp("Anup", 2400d));
		emps.add(new Emp("Asp", 3000d));
		emps.add(new Emp("Gaurav", 1000d));
		emps.add(new Emp("As", 3000d));
		
		
		for(Emp e : emps) {
			
			System.out.println(e);
			
		}
		
	}

}
