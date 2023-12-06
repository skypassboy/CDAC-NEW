package reflection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;

public class CreateInstanceDynamically {

	public static void main(String[] args) throws Exception 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter class name : ");
		//java.lang.String
		String clname = br.readLine();
		
		Class c = Class.forName(clname);
		Constructor	con	= c.getConstructor(char[].class);
		char [] arr = {'h','e','l','l','o'};
		Object obj = con.newInstance(arr);
		if(obj instanceof String)
			System.out.println(((String)obj).toUpperCase());
			  
		
		/*
		String mname = br.readLine();
		s1.mname();
		*/

	}

}
