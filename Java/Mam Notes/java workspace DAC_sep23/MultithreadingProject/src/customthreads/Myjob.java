package customthreads;

public class Myjob implements Runnable //1.class implementing Runnable 
{

	//2.declaring thread controller
	private Thread t;

	public Myjob()
	{
		//3.Create instance of thread
		t=new Thread(this);
	}
	
	//4.to make t accessible outside
	public Thread getThread()
	{
		return t;
	}
	
	//5.implementing run method
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
