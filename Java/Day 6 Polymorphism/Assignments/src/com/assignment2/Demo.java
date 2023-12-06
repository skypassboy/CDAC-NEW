package com.assignment2;

public class Demo {
	
	
	
	public static void main(String[] args) {
		
		
		Book [] allBooks = new Book[5];
		
		allBooks[0] = new EBook(101, "Alchimest", 200);
		allBooks[1] = new PaperBook(102,"Heavens", 500);
		allBooks[2] = new EBook(103,"megaliving",300);
		allBooks[3] = new PaperBook(104,"Ram",600);
		allBooks[4] = new PaperBook(105, "game", 650);
		
		
		for(Book b: allBooks) {
			System.out.println(b);
			System.out.println(b.calCost());
		}
		
		
		
	}

}
