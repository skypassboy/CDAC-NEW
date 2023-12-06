package shapes;

import utils.Drawable;

public class Rectangle implements Drawable {

	private double length,breadth;	
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public void drawShape() {
		System.out.println("in the draw shape of Rectangle");
	}

	
	public double calArea() {
		return length*breadth;
	}
	
	public String getType() {
		return "2d";
	}

}
