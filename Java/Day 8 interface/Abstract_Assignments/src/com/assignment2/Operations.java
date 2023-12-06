package com.assignment2;

public class Operations implements IntOperations {

	@Override
	public boolean isOdd(int num) {
		// TODO Auto-generated method stub
		if(num%2==0) {
			return false;
		}
		else{
			return true;
		}
		
	}

	@Override
	public boolean isEven(int num) {
		// TODO Auto-generated method stub
		if(num%2==0) {
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public boolean isPrime(int num) {
		// TODO Auto-generated method stub
		if(num==1) {
			return false;
		}
		else {
//			boolean flag= false;
			int count=0;
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}
			
			if(count>2) {
				return false;
			}
			else {
				return true;
			}
			
		}
	}

	@Override
	public double calFactorial(int num) {
		// TODO Auto-generated method stub
		double fact=1;
		
		for(double i = 1;i<=num;i++) {
			fact  = fact *i;
		}
		return fact;
	}
		
	
}
