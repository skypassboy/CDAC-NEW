public class Customer{

	private String emailId;
	private Address address;

	public Customer(){
	
		emailId = "-";
		address = new Address("-","-","-");
	}
	
	public Customer(String emailId, Address address){
	
		this.emailId = emailId;
		this.address = address;
	}
	
	public void display(){

		System.out.println("Email-Id : "+ emailId);
		address.display();

	}
	
	



}