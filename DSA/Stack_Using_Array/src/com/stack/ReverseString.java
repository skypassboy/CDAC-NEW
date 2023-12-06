package com.stack;

public class ReverseString {

	public static void main(String[] args) {
		
		
		CharStack c = new CharStack(6);
		
		String str = "Ritesh";
		
		for(char i : str.toCharArray()) {
			c.push(i);
		}
		
		c.display();

	}

}
