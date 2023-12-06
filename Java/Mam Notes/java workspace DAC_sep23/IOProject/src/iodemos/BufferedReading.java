package iodemos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReading {

	public static void main(String[] args) {
		BufferedReader br = null;
		try
		{
		    br = new BufferedReader(new FileReader("D:/myfiles/bufferdata.txt"));
		    String str;
			int count=0;
			while( (str=br.readLine()) != null)
				System.out.println((++count)+" : "+str);
			
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
