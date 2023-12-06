package com.assignment1;

public class Rectangle implements Drawable {
	
	
	private float length;
	private float breadth;

	
	
	
	
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	
	
	
	public float getLength() {
		return length;
	}




	public void setLength(float length) {
		this.length = length;
	}




	public float getBreadth() {
		return breadth;
	}




	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}


	@Override
	public String drawShape() {
		
		return "In drawshape of rectangle...";
		
	}
	
	@Override
	public float calArea() {
		// TODO Auto-generated method stub
		return length*breadth;
	}




	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", Shape=" + drawShape() + ", Area Of Rectangle="
				+ calArea() + "]";
	}
	
	
	
}
