package com.assignment3;

public class ColorDemo {

	public static void main(String[] args) throws InvalidColorException {
		
		try {
			ColorPoint c1 = new ColorPoint("lambda");
			System.out.println(c1);
		} catch (InvalidColorException e) {
			System.out.println(e.getMsg());;
		}
	}

}
