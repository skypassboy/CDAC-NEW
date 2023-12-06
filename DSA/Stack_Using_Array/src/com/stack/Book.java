package com.stack;

public class Book {
	
	private String name;
	private int price;
	
	public Book() {
		
	}
	public Book(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	
	
}
