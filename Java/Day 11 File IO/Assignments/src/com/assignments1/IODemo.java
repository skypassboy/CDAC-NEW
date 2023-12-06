package com.assignments1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IODemo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;
		System.out.println("Enter q to exit");
		int count1 =0;
		int count2 =0;
		while((n = br.read())!= 'q') {
			System.out.println((char)n);
			if(n>='0' && n<='9') {
				count1++;
			}
			else if(n>='A' && n<='Z'||n>='a' && n<='z'){
				count2++;
			}
//			else if(n>='a' && n<='z') {
//				count2++;
//			}
		}
		System.out.println("count Digits = "+count1);
		System.out.println("count Alphabets = "+count2);
		br.close();

	}

}
