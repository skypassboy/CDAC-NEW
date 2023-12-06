package com.assignment1;

public class Circle implements Drawable {
	
	private float radius;
	
	
	
	
	public Circle(float radius) {
		super();
		this.radius = radius;
	}
	
	
	
	public float getRadius() {
		return radius;
	}



	public void setRadius(float radius) {
		this.radius = radius;
	}

	

	@Override
	public String drawShape() {
		
		return "In drawshape of circle...";
	}

	@Override
	public float calArea() {
		// TODO Auto-generated method stub
		return PI*radius*radius;
	}



	@Override
//	public String toString() {
//		return "Circle [radius=" + radius + ", Shape= " +drawShape()+ ", Area of Circle= " + calArea() + "]";
//	}
	
	public String toString() {
		return "Area of circle : "+calArea();
	}
	
	
	
}
