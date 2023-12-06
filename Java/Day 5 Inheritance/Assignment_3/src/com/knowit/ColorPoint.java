package com.knowit;

//import java.util.Objects;

public class ColorPoint {
	
	
	private String color;
	
//	private static String []colors = {"red","green","yellow","violet","orange","pink","blue"};
	
	private static String [] colors;
	
	static {
		
		colors = new String[5];
		colors[0] = "red";
		colors[1] = "green";
		colors[2] = "yellow";
		colors[3] = "violet";
		colors[4] = "pink";
		
	}
	
	public ColorPoint() {
		super();

	}

	public ColorPoint(String color) {
		super();
		
		boolean flag=false;
		for(int i=0;i<colors.length;i++) {
			if(color.equalsIgnoreCase(colors[i])) {
				flag=true;
			}
		}
		
		if(flag==true) {
			
			this.color = color;
		}
		else {
			this.color = "white";
		}
	}
	
	

	public void display() {
		System.out.println("Color : "+ color);
	}

	
}
