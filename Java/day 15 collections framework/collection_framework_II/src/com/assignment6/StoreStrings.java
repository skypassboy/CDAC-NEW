package com.assignment6;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StoreStrings {

	public static void main(String[] args) {
		
		
		Set<String> strs = new TreeSet<String>((String s1,String s2)->{
			
			if(s1.length()>s2.length()) {
				return 1;
			}
			else if(s1.length()<s2.length()) {
				return -1;
			}
			else {
				if(s1.charAt(0)>s2.charAt(0)) {
					return 1;
				}
				else if(s1.charAt(0)<s2.charAt(0)) {
					return -1;
				}
				else {
					return 0;
				}
			}
			
			
		});
		
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Enter string " + (i+1));
			String str = sc.next();
			
			strs.add(str);
		}
		
		
		for(String e: strs) {
			System.out.println(e);
		}

	}

}
