public class Account{

	private int accountNo;
	private double balance;

	public Account(){
	
	};
	
	public Account(int accountNo, double balance){
		
		this.accountNo = accountNo;
		this.balance = balance;

	};

	public void display(){
	
		System.out.println("Account no : "+ accountNo);
		System.out.println("Balance : "+ balance);
		
	}



}