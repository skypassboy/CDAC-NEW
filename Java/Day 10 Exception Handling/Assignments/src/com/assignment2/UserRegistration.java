package com.assignment2;

public class UserRegistration {
	
	String userName;
	String userCountry;
	
	public UserRegistration() {
		super();
	}
	
//	public UserRegistration(String userName, String userCountry) throws InvalidCountryException{
//		
//		this.userName = userName;
//		
//		if(userCountry.equalsIgnoreCase("India")) {
//			this.userCountry = userCountry;
//		}
//		else {
//			throw new InvalidCountryException();
//		}
//	}
	
	public String registerUser(String userName, String userCountry) throws InvalidCountryException {
		
		
		
		if(userCountry.equalsIgnoreCase("India")) {
			this.userName = userName;
			this.userCountry = userCountry;
			return "User Registered Successfully...!";
		}
		else {
			throw new InvalidCountryException();
			
		}
		
	}
	
}
