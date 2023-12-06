package com.assignment4;

public class RollComparer implements Comparer{

	@Override
	public int compare(Object o1, Object o2) {
		
		Student s1 = null;
		Student s2 = null;
		
		if(o1 instanceof Student) {
			s1 = (Student)o1;
		}
		
		if(o2 instanceof Student) {
			s2 = (Student)o2;
		}
		
		return s1.getRollNo() - s2.getRollNo();
	}

}
