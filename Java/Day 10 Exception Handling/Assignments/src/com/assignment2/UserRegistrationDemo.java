package com.assignment2;

public class UserRegistrationDemo {

	public static void main(String[] args) {
		
		UserRegistration u1 = new UserRegistration();
		
		try {
			System.out.println(u1.registerUser("Ritesh", "india"));
			
		} catch (InvalidCountryException e) {
			
			System.out.println(e.getMsg());
		}
		
		

	}

}
