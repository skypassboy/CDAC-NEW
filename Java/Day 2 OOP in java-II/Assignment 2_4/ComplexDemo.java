public class ComplexDemo{
	
	public static void main(String args[]){
	Complex c1 = new Complex();
	c1.ComplexNo();
	
	System.out.println("********************************");
	
	Complex c2 = new Complex(12,13);
	c2.ComplexNo();
	
	System.out.println("********************************");

	Complex c3 = new Complex(12,-18);
	c3.ComplexNo();
	
	System.out.println("********************************");
	
	Complex c4 = new Complex(c3);
	c4.ComplexNo();
	}

}