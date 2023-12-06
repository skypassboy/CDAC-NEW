package com.assignment2;

public abstract class Book {
	
	int bookId;
	String title;
	float price;
	
	public Book(int bookId, String title, float price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", price=" + price + "]";
	}

	public abstract float calCost();
	
	
}
