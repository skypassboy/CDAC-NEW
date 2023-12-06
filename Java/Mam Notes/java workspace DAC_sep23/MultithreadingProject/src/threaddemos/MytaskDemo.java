package threaddemos;

import customthreads.Mytask;

public class MytaskDemo {

	public static void main(String[] args) {
		Runnable r = new Mytask();
		Thread t = new Thread(r);
		t.start();   //r.run()
		
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
