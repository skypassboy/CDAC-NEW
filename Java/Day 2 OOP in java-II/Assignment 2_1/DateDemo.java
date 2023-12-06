public class DateDemo{
	
	public static void main(String args[]){

		Date d1 = new Date();
		d1.showDate();
		d1.showDate('-');
	
		System.out.println("***************************************");

		Date d2 = new Date(25,05,1999);
		d2.showDate();
		d2.showDate('-');
		
		System.out.println("***************************************");

		Date d3 = new Date(d2);
		d3.showDate();
		d1.showDate('-');

		System.out.println("***************************************");
	
	}
	


}