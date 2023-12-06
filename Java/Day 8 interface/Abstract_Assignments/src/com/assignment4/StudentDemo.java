package com.assignment4;

public class StudentDemo {

	public static void main(String[] args) {
		
		
		Student [] arr = new Student[5];
		
		arr[0] = new Student(101, 95, "Ritesh");
		arr[1] = new Student(102,96,"Nikhil");
		arr[2] = new Student(103,99,"Atharv");
		arr[3] = new Student(104,98,"Ram");
		arr[4] = new Student(105,91,"Tushar");
		
		Comparer c = new MeritComparer();
			
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(c.compare(arr[i], arr[j])<0) {
					Student temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(Student s: arr) {
			System.out.println(s);
		}
		
		
		

	}

}
