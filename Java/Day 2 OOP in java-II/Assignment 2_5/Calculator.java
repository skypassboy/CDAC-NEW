public class Calculator{


	private int a,b;

	public Calculator(){};
	
	public Calculator(int a,int b){
	
		this.a = a;
		this.b = b;
		
	}

	public void Add(){
	
		System.out.println( a+b + " is Addition of a and b");
	
	}
	
	public void Substract(){
	
		System.out.println( a-b + " is Substraction of a and b " );
	
	}

	
	public void Multiplication(){
	
		System.out.println(a*b  + " is Multiplication of a and b" );
	
	}

	public void Division(){
	
		System.out.println(a/b + "is Division of a and b" );
	
	}

	












}