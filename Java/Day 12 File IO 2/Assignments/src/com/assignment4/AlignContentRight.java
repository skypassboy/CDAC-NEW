package com.assignment4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AlignContentRight {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		        String fileName = "C:\\Users\\Ritesh\\Desktop\\Demo\\Demo.txt"; // Replace with your file's name

		        BufferedReader bf = new BufferedReader(new FileReader(fileName));
		            String line;
//		            int lineNumber = 1;
		            String maxStr = "";
		            String z = "-";
		            while ((line = bf.readLine()) != null) {
		                System.out.println(line);
		            	if(maxStr.length()<line.length()) {
		            		maxStr=line;
		            	}
//		              lineNumber++;
		            }
//		            System.out.println(maxStr.length());
//		          
		            System.out.println("******************************************************************************************");
			        
		            BufferedReader bf1 = new BufferedReader(new FileReader(fileName));
			        
		            String newLine;
		            while((newLine = bf1.readLine())!=null) {
//		            	System.out.println("outside for loop");
		        	   
		        	   for(int i=0;i<=maxStr.length()-newLine.length();i++) {
		        		   System.out.print(z);
		        	   }
		        	   System.out.print(newLine);
		        	   System.out.println("");
		           }
	}
	
}
