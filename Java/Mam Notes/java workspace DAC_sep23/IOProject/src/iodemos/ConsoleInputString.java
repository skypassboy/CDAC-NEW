package iodemos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputString {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 'stop' to quit ");
		
		String str;
		
		String maxstr="";
		int maxlength=0;
		
		while(!((str=br.readLine()).equals("stop")))
		{
			//System.out.println(str);
			if(maxlength<str.length()) {
				maxlength = str.length();
				maxstr = str;
			}
		}
		System.out.println(maxstr);	
		
		br.close();
		
	}

}
