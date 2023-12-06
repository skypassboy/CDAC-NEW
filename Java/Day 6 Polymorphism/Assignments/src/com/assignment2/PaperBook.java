package com.assignment2;

public class PaperBook extends Book{

	public PaperBook(int bookId, String title, float price) {
		super(bookId, title, price);
		// TODO Auto-generated constructor stub
	}


	public float calCost() {
		
		if(getPrice()<=500) {
			return getPrice()*0.93f;
		}
		else if(getPrice()>500 && getPrice()<=1000) {
			return getPrice()*0.95f;
		}
		else if(getPrice()>1000 && getPrice()<=5000) {
			return getPrice()*0.98f;
		}
		
		return getPrice();
		
	}
	
	@Override
	public String toString() {
		return "PaperBook [bookId=" + bookId + ", title=" + title + ", price=" + price + ", Cost=" + calCost()
		+ "]";
	}
	
	
}
