package threaddemos;

import customthreads.CountDownJob;

public class CountDownJobDemo {

	public static void main(String[] args) {
		CountDownJob j1 = new CountDownJob("first", 780);
		CountDownJob j2 = new CountDownJob("second", 570);
		CountDownJob j3 = new CountDownJob("third", 950);
		
		System.out.println("Counting down begins.....");
		j1.getT().start();
		j2.getT().start();
		j3.getT().start();
		
		try
		{
			j1.getT().join();
			j2.getT().join();
			j3.getT().join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Counting down ends.....");
		

	}

}
