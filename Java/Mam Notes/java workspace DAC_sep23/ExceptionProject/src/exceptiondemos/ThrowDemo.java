package exceptiondemos;

import java.io.IOException;

public class ThrowDemo {

	public static void main(String[] args) {
		//throwing exception object
		//throw new NullPointerException();
		try
		{
			//anomymous object
			throw new IOException();
			//not possible because objects are not throwable
			//throw new String("welcome");
			//throw new Integer(10);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
