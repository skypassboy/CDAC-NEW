package iodemos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferedWriting {

	public static void main(String[] args) throws Exception
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter file name : ");
		String fname = br.readLine();
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:/myfiles/"+fname));
		System.out.println("Enter data to be written : ");
		System.out.println("Enter 'stop' to quit");
		String str;
		while(!((str = br.readLine()).equals("stop")))
		{
			bw.write(str);
			bw.newLine();
		}
		//bw.flush();
		bw.close();   //flushes automatically
		
		

	}

}
