package com.assignment3;

public class Demo {

	public static void main(String[] args) {
		
	
		Emp [] allEmp = new Emp[3];
		
		allEmp[0] = new SalesMananger("Ritesh", new Date(12,5,2023), 101, 100000, 200, 20,10);
		allEmp[1] = new Programmer("ASP", new Date(12,6,2023), 102, 90000, 20, 500,12);
		allEmp[2] = new Admin("Ram",new Date(12,06,1999),103,50000,10000);
		
		
//		for(Emp e : allEmp) {
//			System.out.println(e);
//			System.out.println("**************************");
//		}
		
		
		for(int i = 0;i<allEmp.length;i++) {
			
			System.out.println(allEmp[i]);
			System.out.println("*****************************************************************************************************");
		}
		
	}

}
