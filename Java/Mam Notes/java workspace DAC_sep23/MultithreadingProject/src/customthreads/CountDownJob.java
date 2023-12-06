package customthreads;

//1.
public class CountDownJob implements Runnable {
	
	//2.
	private Thread t;
	private String name;
	private int num;	
	
	public CountDownJob(String name, int num) {
		super();
		this.name = name;
		this.num = num;
		//3
		this.t = new Thread(this);   //this.run() 
	}

	//4.
	public Thread getT()
	{
		return t;
	}
	
	//5.
	public void run() {
		while(num > 0)
		{
			System.out.println(name+" thread counts down : "+num);
			num--;
		}
	}

}
