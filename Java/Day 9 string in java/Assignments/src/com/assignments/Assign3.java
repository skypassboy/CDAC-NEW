package com.assignments;

public class Assign3 {

	public static void main(String[] args) {
		
		
		String str = "RiTeSh";
		String c ="";
		for(int i=0;i<=str.length()-1;i++) {
			
			if(Character.isUpperCase(str.charAt(i))) {

				int ch = (str.charAt(i)+32);
				char cha = (char)(ch);
				c = c + cha;
			}
			else {

				int ch = (str.charAt(i)-32);
				char cha = (char)(ch);
				c = c + cha;
			}
			
		}
		
		for(int i=0;i<=c.length()-1;i++) {
			System.out.println(c.charAt(i));
		}
	}

}
