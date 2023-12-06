package com.assignment1_1;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array...");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		for(int i=0;i<size;i++) {
			
			System.out.println("Enter Array Element "+ (i+1));
			arr[i] = sc.nextInt();
		}
		
		try {
			System.out.println("Enter index to find element...");
			int index = sc.nextInt();
			
			for(int i=0;i<arr.length;i++) {
				
					System.out.println(arr[index]);
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
