package com.assignment1;

public class Triangle implements Drawable {
	
	private float base;
	private float height;
	
	
	public Triangle(float base, float height) {
		super();
		this.base = base;
		this.height = height;
	}
	

	
	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}




	
	@Override
	public String drawShape() {
		
		return "In drawshape of Triangle...";
		
	}

	@Override
	public float calArea() {
		// TODO Auto-generated method stub
		return 0.5f*base*height;
	}



	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + ", Shape=" + drawShape() + ", Area of Triangle="
				+ calArea() + "]";
	}
	
	
}
