package demos;

import shapes.Circle;
import shapes.Rectangle;
import utils.Drawable;

public class ShapeDemo {

	public static void main(String[] args) {
		Drawable [] shapes = new Drawable[2];  //creating array object
		shapes[0] = new Circle(4.6);
		shapes[1] = new Rectangle(4.8, 3.2);
		
		
		//run time polymorphism
		for(Drawable d : shapes)
		{
			d.drawShape();
			System.out.println("Area : "+d.calArea());
		}

	}

}
