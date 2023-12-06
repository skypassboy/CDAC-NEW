package com.assignment2;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		OutputStream os = new FileOutputStream("C:\\Users\\Ritesh\\Desktop\\File_test\\testDemo.txt",true);
		
		System.out.println("Enter stop to quit");
		String str;
		
		while(!(str = br.readLine()).equals("Stop")) {
			byte[]arr = str.getBytes();
			os.write(arr);
			
		}
		br.close();
		os.close();
	}

}
