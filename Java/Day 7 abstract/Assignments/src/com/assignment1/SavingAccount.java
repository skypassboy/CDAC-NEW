package com.assignment1;

public class SavingAccount extends Account {
	
	
	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(int accNo, String name, double balance) {
		super(accNo, name, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amt) {
		// TODO Auto-generated method stub
		if(amt>getBalance()) {
			System.out.println("Insufficient balance...!");
		}
		else if(getBalance()-amt<2000) {
			System.out.println("Insufficient balance...!");
		}
		else if(getBalance()-amt>2000) {
			System.out.println(amt +" is debited from "+ getAccNo());
		}
	}
	
	
	
		
}
