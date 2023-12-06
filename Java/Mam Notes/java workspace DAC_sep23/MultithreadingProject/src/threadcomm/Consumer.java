package threadcomm;

public class Consumer implements Runnable {

	private Thread t;
	private Stock s;
	private boolean bRun;
	
	public Consumer(Stock s)
	{
		this.s=s;
		t=new Thread(this);
		bRun=true;
	}

	public Thread getT()
	{
		return t;
	}	
	
	public void run() {
		while(bRun)   //bRun - false - run method returns
			s.consume();
	}
	
	public void stopNow()
	{
		bRun=false;
	}
}
