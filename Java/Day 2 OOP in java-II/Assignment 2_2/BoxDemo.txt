public class BoxDemo{
	public static void main(String args[]){

		Box b1 = new Box();
		b1.boxVolume();
	
		System.out.println("***************************************");

		Box b2 = new Box(10,20,30);
		b2.boxVolume();
		
		System.out.println("***************************************");
		
		Box b3 =  new Box(b2);
		b3.boxVolume();
		
	}
	
}