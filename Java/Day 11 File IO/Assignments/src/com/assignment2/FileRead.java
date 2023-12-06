package com.assignment2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileRead {

	public static void main(String [] args) throws IOException {
		
		File f = new File("C:\\Users\\Ritesh\\Desktop\\File_test\\testDemo.txt");
		
		InputStream is = null;
		
		if(f.exists()) {
			if(f.canRead()) {
				if(f.length()>0) {
					is = new FileInputStream(f);
					
				}
			}
		}
		int n;
		while((n=is.read())!=-1) {
			System.out.print((char)n);
		}
		is.close();
		
	}
	
}
