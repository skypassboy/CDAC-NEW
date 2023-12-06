package threaddemos;

public class DeafultThreadDemo {

	public static void main(String[] args) {
		 Thread t = Thread.currentThread();
		 System.out.println(t.getName());
		 System.out.println(t.getPriority());
		 
		 t.setName("application");
		 t.setPriority(Thread.MAX_PRIORITY);
		 System.out.println("After Modification .....");
		 System.out.println(t.getName());
		 System.out.println(t.getPriority());
		 //1 to 10
	}

}
