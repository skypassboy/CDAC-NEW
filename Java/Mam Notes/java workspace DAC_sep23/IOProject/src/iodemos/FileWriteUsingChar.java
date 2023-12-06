package iodemos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Writer;

public class FileWriteUsingChar {

	public static void main(String[] args) {
		Writer os = null;
		BufferedReader br = null;
		try
		{
			os = new FileWriter("D:\\myfiles\\buffer.txt",true);
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter stop to quit");
			String str;
			while(!((str=br.readLine()).equals("stop")))
			{
				//byte [] arr = str.getBytes();
				os.write(str);
				os.write("\n");
			}
			
			//fr
			//fw
			
			/*while( (n = fr.read()) != -1)
				fw.write(n); */
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
				os.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}
