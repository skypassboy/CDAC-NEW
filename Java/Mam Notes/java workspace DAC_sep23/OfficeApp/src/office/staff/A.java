package office.staff;

public class A {

	public void display()
	{
		Emp e = new SalesManager();
		//salary is protected member in Emp
		System.out.println(e.salary);
	}

}
