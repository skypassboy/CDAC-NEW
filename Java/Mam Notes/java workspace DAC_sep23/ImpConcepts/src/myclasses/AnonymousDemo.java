package myclasses;

abstract class X{
	public abstract void display();
}

public class AnonymousDemo {

	public static void main(String[] args) {
		
		//anonymous inner class - interface
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("in run method");
			}			
		};  //end of statement
		
		Thread t = new Thread(r);
		t.start();  //r.run()
		
		//anonymous innner class - abstract class
		X obj = new X() {
			@Override
			public void display() {
				System.out.println("in display method");
				
			}			
		} ;
		obj.display();
		
		//lambda expression - compact
		/*Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=5;i++)
				{
					System.out.println("thread : "+i);
				}
			}
		});
		t1.start(); */
		
		Thread t1 = new Thread( ()->{ System.out.println("in run method");});  
		t1.start();
		
		//X a1=new X() {};
	}

}
