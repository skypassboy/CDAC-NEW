package com.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MaxFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		        String fileName = "C:\\Users\\Ritesh\\Desktop\\Demo\\Demo.txt"; // Replace with your file's name

		        BufferedReader bf = new BufferedReader(new FileReader(fileName));
		            String line;
		            int lineNumber = 1;
		            
		            String maxStr = "";
		            int maxCount=0;
		            while ((line = bf.readLine()) != null) {
		            	
		            	lineNumber++;
		            	
		            	if(maxStr.length()<line.length()) {
		            		maxStr = line;
		            		maxCount=lineNumber;
		            	}
		            	
//		                System.out.println("Line " + lineNumber + ": " + line);
		            }
		            System.out.println("Line "+maxCount + ": " + maxStr);
	}

}
