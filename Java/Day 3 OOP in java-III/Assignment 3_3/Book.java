public class Book{

	private int bookId;
	private float price;
	private static int count;

	public Book(){
	
		count++;
		bookId = count;
		price = 0;
	
	}
	
	public Book(float price){
	
		count++;
		this.price = price;
		bookId = count;
	
	}
	
	public void display(){
	
		System.out.println("Book ID : "+ bookId);
		System.out.println("Price : "+ price);
	
	}



}