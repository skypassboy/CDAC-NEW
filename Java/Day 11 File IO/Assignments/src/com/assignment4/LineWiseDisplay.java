package com.assignment4;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineWiseDisplay {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		        String fileName = "C:\\Users\\Ritesh\\Desktop\\Demo\\Demo.txt"; // Replace with your file's name

		        BufferedReader bf = new BufferedReader(new FileReader(fileName));
		            String line;
		            int lineNumber = 1;

		            while ((line = bf.readLine()) != null) {
		                System.out.println("Line " + lineNumber + ": " + line);
		                lineNumber++;
		            }
	}
}