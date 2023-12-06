package customthreads;

public class Mytask implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child thread : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	

}
