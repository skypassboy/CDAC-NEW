package threaddemos;

import customthreads.Myjob;

public class MyjobDemo {

	public static void main(String[] args) {
		Myjob j1 = new Myjob();
		//j1.start();
		j1.getThread().start();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main thread : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		

	}

}
