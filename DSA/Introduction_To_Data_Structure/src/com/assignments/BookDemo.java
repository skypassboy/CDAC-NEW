package com.assignments;

import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) {
		Book books[];
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter size for Book Array ");
		int no=sc.nextInt();
		books=new Book[no];

		int bno,cnt=0;
		String name;
		int ch;
		do
		{
			System.out.println(" 1. Add Recod");
			System.out.println(" 2. Display All Records ");
			System.out.println(" 3. Modify");
			System.out.println(" 4. Delete Record");
			System.out.println(" Enter Your choice ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println(" Enter Book No ");
				bno=sc.nextInt();
				System.out.println(" Enter Name ");
				name=sc.next();
				books[cnt++]=new Book(bno,name);
				break;
			case 2:
				for(int i=0;i<cnt;i++)
					System.out.println(books[i]);
				break;
			
			case 3:
				System.out.println("Enter Book ID you want to change :");
				int bid = sc.nextInt();
				for(int i=0;i<books.length;i++)
					{
						if(bid==books[i].bno)
						{
							System.out.println("Enter book no.");
							bno = sc.nextInt();
							System.out.println("Enter book name");
							name = sc.next();
							books[bid-1]= new Book(bno,name);
							break;
						}
					}
				break;
			case 4:
				System.out.println("Enter index to delete");
				int index = sc.nextInt();
				for(int i=index;i<cnt-1; i++)
				{
					books[i] = books[i+1];
					
				}
				cnt--;
				break;
			}
			
		}while(ch!=0);


	}

}
