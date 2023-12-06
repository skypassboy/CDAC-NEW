package apps;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import office.staff.Emp;

public class DeserializationDemo {

	public static void main(String[] args) throws Exception
	{
		Emp [] empty = new Emp[3];
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/myfiles/empdata.dat"));
		
		for(int i=0;i<empty.length;i++)
		{
			//ClassNotFoundException
			Object o = ois.readObject();
			if(o instanceof Emp)
			{
				empty[i] = (Emp)o;
			}
		}
		
		ois.close();
		
		for(Emp e : empty)
		{
			System.out.println(e);
			System.out.println("**************");
		}
		
	}

}
