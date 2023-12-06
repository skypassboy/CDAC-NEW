package CustomerCollection;
import java.util.*;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomerListDemo 
{
	public static void main(String []args) throws IOException, ClassNotFoundException
	{
		List <Customer> list=new ArrayList<>();
		
		
		list.add(new RegCustomer("manasi", "manasi@mail", 22314233, 101));
		list.add(new RegCustomer("rahul", "rahul@mail", 22314233, 102));
		list.add(new RegCustomer("shubham", "shubham@mail", 22314233, 103));
		list.add(new RegCustomer("aniket", "aniket@mail", 22314233, 104));
		list.add(new Customer("manaswi", "manaswi@mail", 22314233l));
		
		
		
		for(Customer c:list)
		{
			System.out.println(c);
		}
		System.out.println("\n\n");
		
		
		
		
		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("D:\\demo\\customer.txt"));
		
		for(Customer c: list)
		{
			oos.writeObject(c);
		}
		oos.close();
		
		List <Customer> temp=new ArrayList<>();
		List <RegCustomer> temp2=new ArrayList<>();
		
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("D:\\demo\\customer.txt"));
		
		while(true)
		{
			try
			{
				Object o=ois.readObject();
				
				if(o instanceof Customer)
				{
					temp.add((Customer)o);
				}
				
				if(o instanceof RegCustomer)
				{
					temp2.add((RegCustomer)o);
				}
			}
			catch(EOFException e)
			{
				break;
			}
		}
		ois.close();
		
		
		
		
		System.out.println("RegCustomer:----------");
		for(Customer c:temp)
		{
			System.out.println(c);
		}
		
		
		System.out.println("\n\nCustomer:----------");
		for(Customer c:temp2)
		{
			System.out.println(c);
		}
		
		
		
	}
	
	
}
