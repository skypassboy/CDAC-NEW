package com.assignments1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IODemoString {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		System.out.println("Enter Stop to exit");
		int maxChar=0;
		String maxStr="";
	
		while(!(str = br.readLine()).equals("stop")) {
//			System.out.println(str);
			if(str.length()>maxChar) {
				maxChar=str.length();
				maxStr = str;
			}
		}
		System.out.println("maxStr = "+ maxStr);
		System.out.println("maxChar = "+ maxChar);
		br.close();
		
	}

}
