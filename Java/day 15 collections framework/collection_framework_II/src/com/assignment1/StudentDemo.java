package com.assignment1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StudentDemo {

	public static void main(String[] args) {
		
		
		Set<Student> students = new HashSet<Student>();
		
		Scanner sc = new Scanner(System.in);
		
		int ch;
		
		
		
		do {
			System.out.println("Enter choise...!");
			System.out.println("1.Add student");
			System.out.println("2.Display");
			System.out.println("0.Exit");
			ch=sc.nextInt();
			
			switch (ch) {
			case 1: 
					
				System.out.println("Enter student details...!");	
				System.out.println("Enter student id");
				int sid = sc.nextInt();
				System.out.println("Enter student name");
				String name = sc.next();
				System.out.println("Enter student city");
				String city = sc.next();
				System.out.println("Enter student percentage");
				float percentage = sc.nextFloat();
				
				Student s = new Student(sid,name,city,percentage);
				students.add(s);
				break;
			
			case 2: 
				 
				for(Student std : students) {
					System.out.println(std);
				}
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
			
		}while(ch!=0);
		
		
	}

}
