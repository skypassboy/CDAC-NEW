package com.knowit;

import java.util.Scanner;

public class CustomerDemo {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		
		String emailId;
		String address;
		float price;
		int regNo;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		do {
			System.out.println("1.Registered customer");
			System.out.println("2.Non-Resgitered customer");
			System.out.println("3.Exit");
			System.out.println("Enter choise: ");
			
			ch = sc.nextInt();
			if(ch==1) {
				System.out.println("Enter Emal :");
				emailId=sc.next();
				System.out.println("Enter address :");
				address=sc.next();
				System.out.println("Enter price :");
				price=sc.nextFloat();
				System.out.println("Enter registration no. :");
				regNo=sc.nextInt();
				
				Customer c = new RegCustomer(emailId,address,price,regNo);
				float dis = c.giveDiscount(price);
				c.display();
				System.out.println("Price :" + dis);
			}
			else if(ch==2) {
				System.out.println("Enter Emal :");
				emailId=sc.next();
				System.out.println("Enter address :");
				address=sc.next();
				System.out.println("Enter price :");
				price=sc.nextFloat();
				
				
				
				Customer c = new Customer(emailId,address,price);
				
				float res = c.giveDiscount(price);
				c.display();
				System.out.println("Price :"+res);
			}
		}
		while(ch!=3);

	}

}
