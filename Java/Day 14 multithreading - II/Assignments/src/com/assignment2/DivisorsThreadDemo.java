package com.assignment2;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisorsThreadDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number...");
		
		int n = Integer.parseInt(bf.readLine());
		
		FileWriter fw = new FileWriter("C:\\Users\\Ritesh\\Desktop\\CDAC\\PG-DAC\\Java\\Day 14 multithreading - II\\Assignments\\src\\com\\assignment2\\Divisors.txt");
		
		System.out.println("file writing started...");
		
		DivisorsThread t1 = new DivisorsThread(n, fw);
		t1.getThread().start();
		
		DivisorsThread t2 = new DivisorsThread(250, fw);
		t2.getThread().start();
		
		DivisorsThread t3 = new DivisorsThread(650, fw);
		t3.getThread().start();
		
		try {
			t1.getThread().join();
			t2.getThread().join();
			t3.getThread().join();
		}
		catch(InterruptedException e) {
			e.getStackTrace();
		}
		
		fw.close();
		System.out.println("file writing ended...");
	}

}
