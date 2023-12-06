package com.assignment1;

public class RecurringAccount extends Account {

	int installment;
	
	public RecurringAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecurringAccount(int accNo, String name, double balance,int installment) {
		super(accNo, name, balance);
		this.installment = installment;
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	@Override
	public void withdraw(double amt) {
		// TODO Auto-generated method stub
		
		System.out.println("Money connot be withdrawn from recurring account...!");
		
	}
	
}
