package com.assignment3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadWriteFile {
	
	
	public static void main(String [] args) throws IOException {

		File f = new File(path);
		
			InputStream is = null;
			
			if(f.exists()) {
				if(f.canRead()) {
					if(f.length()>0) {
						is = new FileInputStream(f);
					}
				}
			}
			int n;
			String readStr = "";
			while((n=is.read())!=-1) {
				readStr = readStr+(char)(n);
			}
			
			
			OutputStream os = new FileOutputStream("C:\\Users\\Ritesh\\Desktop\\Destination\\destDemo.txt",true);

				byte[]arr = readStr.getBytes();
				os.write(arr);
				
				os.close();
				is.close();
				
	}
	
}
