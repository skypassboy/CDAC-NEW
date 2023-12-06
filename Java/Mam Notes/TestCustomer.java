package Office;
import java.util.Scanner;
public class TestCustomer 
{
	public static void main(String [] args) 
	{
		Scanner sc = new Scanner(System.in);
		Customer c1=null;
		System.out.println("Enter type of customer : ");
		int n = sc.nextInt();
		System.out.println("Enter email : ");
		String email = sc.nextLine();
		sc.next();
		System.out.println("Enter address : ");
		String add = sc.nextLine();
		sc.next();
		if(n==1)
		{
			c1 = new Customer(email,add);
			
		}
		else if(n==2)
		{
			System.out.println("Enter regno : ");
			int rno = sc.nextInt();
			c1 = new RegCustomer(email, add, rno);
		}
		System.out.println("Enter shopping price : ");
		double pr = sc.nextDouble();
		c1.display();
		System.out.println("Final discounted price : "+ c1.giveDiscount(pr));
		
	}
}
