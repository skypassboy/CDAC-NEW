public class AddDemo{


	public static void main(String args[]){
	

		Add a1 = new Add();	
		a1.addition(12,13);

		System.out.println("************************************");
		Add a2 = new Add();
		a2.addition(12,13,14);
		
		System.out.println("************************************");
		Add a3 = new Add();
		a3.addition(12,13.5f);

		System.out.println("************************************");
		Add a4 = new Add();
		a4.addition(12,13,14.96);


	}


}