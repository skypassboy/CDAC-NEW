package com.assignment5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TransferTask implements Runnable {
		
	Thread t;
	String path1;
	String path2;
	public TransferTask() {
		t = new Thread(this);
	}
	
	public TransferTask(String path1, String path2) {
		this.path1 = path1;
		this.path2 = path2;
		t = new Thread(this);
	}
	
	
	
	
	public void run(){
		
		  

	        BufferedReader bf = null;
			try {
				bf = new BufferedReader(new FileReader(path1));
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
	            String line;
	          

	            try {
					while ((line = bf.readLine()) != null) {
					   try  {
						   BufferedWriter bw = new BufferedWriter(new FileWriter(path2));
						bw.write(line);
					   		}catch(IOException e) {
					   			e.printStackTrace();
					   		}
					  
					}
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			try {
				bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	
	}

}