package com.assignments;

public class FiboSeries {
	
	
	public static void fiboSeries(int a,int b,int terms) {
			
		for(int i=1;i<=terms;i++) {
			System.out.println(a);
			int c = a+b;
			a=b;
			b=c;
		}
		
	}
	

	public static void main(String[] args) {
		
		FiboSeries.fiboSeries(0, 1, 10);

	}

}
