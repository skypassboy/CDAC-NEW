package threaddemos;

import customthreads.Mythread;

public class MythreadDemo {

	public static void main(String[] args) {
		Thread t = new Mythread();   //newly created state
		t.start();   //runnable
		
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
