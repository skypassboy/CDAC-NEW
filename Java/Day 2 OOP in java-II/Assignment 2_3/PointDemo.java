public class PointDemo{
	
	public static void main(String args[]){

		Point p1 = new Point();
		p1.coordinates();
		
		System.out.println("********************************");

		Point p2 = new Point(10,20);	
		p2.coordinates();

		System.out.println("********************************");
		
		Point p3 = new Point(p2);
		p3.coordinates();
		
	}
	

}