package com.assignment2;

public class EBook extends Book{
	
	
	public EBook(int bookId, String title, float price) {
		super(bookId, title, price);
		
	}

	public float calCost() {
		
		if(getPrice()<=500) {
			return getPrice()*0.98f;
		}
		else if(getPrice()>500 && getPrice()<=1000) {
			return getPrice()*0.95f;
		}
		else if(getPrice()>1000 && getPrice()<=5000) {
			return getPrice()*0.93f;
		}
		
		return getPrice();
		
	}

	@Override
	public String toString() {
		return "EBook [bookId=" + bookId + ", title=" + title + ", price=" + price + ", Cost=" + calCost() + "]";
	}
	
	
	
	
}
