package exceptiondemos;

import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) throws IOException
	{
		m1();
		
	

	}
	
	static void m1() throws IOException
	{
		m2();
	}
	
	static void m2() throws IOException
	{
		m3();
		/*try
		{
		  m3();
		}
		catch(Exception e)
		{
			
		}*/
	}
	
	static void m3() throws IOException 
	{
		throw new IOException();
		
		/*try
		{
			throw new IOException();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}*/
	}

}




