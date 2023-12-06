package com.assignment1;

public class Shapes {

	public static void main(String[] args) {
		
		
		Drawable [] d = new Drawable[3];
		
		

////		
		d[0] = new Circle(5.3f);
		d[1] = new Rectangle(12, 15);
		d[2] = new Triangle(10, 12);
//		
		
		for(Drawable s : d) {
			System.out.println(s);
		}
//		
//		int []arr = {1,2,3,4,5};
//		
//		for(int i : arr) {
//			System.out.print(i+" ");
//		}
//		
		
		
		
	}

}
