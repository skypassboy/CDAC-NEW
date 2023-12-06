package com.assignment4;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EmpDemo {

	public static void main(String[] args) {

//		Set<Emp> emps = new TreeSet<Emp>(new Comparator<Emp>(){
//			
//			public int compare(Emp e1,Emp e2) {
//				
//				int diff = (int) (e1.getSalary()-e2.getSalary());
//				
//				if(diff==0) {
//					diff = e1.getName().compareTo(e2.getName());
//					return (int) diff;
//				}
//				return (int) diff;
//				
//				
//			}
//			
//		});

		Set<Emp> emps = new TreeSet<Emp>((Emp e1,Emp e2)->{
			
			int diff = (int) (e1.getSalary()-e2.getSalary());

			if(diff==0) {
				diff = e1.getName().compareTo(e2.getName());
				return (int) diff;
			}
			return (int) diff;
			
			
		});

		emps.add(new Emp("Ritesh", 1000d));
		emps.add(new Emp("Anup", 2400d));
		emps.add(new Emp("Asp", 3000d));
		emps.add(new Emp("Gaurav", 1000d));
		emps.add(new Emp("As", 3000d));

		for (Emp e : emps) {

			System.out.println(e);

		}

	}

}
