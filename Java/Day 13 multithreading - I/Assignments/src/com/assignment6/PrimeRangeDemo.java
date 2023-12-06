package com.assignment6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeRangeDemo {

	public static void main(String[] args) {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter Start of Range");
			int st= Integer.parseInt(br.readLine());
			System.out.println("Enter End of Range");
			
			int end= Integer.parseInt(br.readLine());
			PrimeRange pr= new PrimeRange(st,end);
			
			pr.getT().start();
			pr.getT().join();
			
			System.out.println("Exit");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}