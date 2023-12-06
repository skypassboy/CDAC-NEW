package com.assignment1;

import java.util.Scanner;

public class Pwd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("Enter Password...");
			String password = sc.next();
			if(password.length()>8 && password.length()<12) {
				System.out.println("valid password");
			}
			else if(password.length()>=12){
				throw new PasswordTooLongException();
			}
			else if(password.length()<=8) {
				throw new PasswordTooShortException();
			}
			
		} catch (PasswordTooLongException e) {
			System.out.println(e.getMsg());
		}
		catch(PasswordTooShortException e) {
			System.out.println(e.getMsg());
		}
		
	
	}

}
