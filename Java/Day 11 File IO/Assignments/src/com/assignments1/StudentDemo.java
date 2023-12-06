package com.assignments1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Enter Roll no :");
		int rollNo = Integer.parseInt(bf.readLine());
		
		System.out.println("Enter name :");
		String name = bf.readLine();
		
		
		System.out.println("Enter marks : ");
		int marks = Integer.parseInt(bf.readLine());
		Student s1 = new Student(rollNo, marks, name);
		
		System.out.println(s1);
		
	}

	

	
}
