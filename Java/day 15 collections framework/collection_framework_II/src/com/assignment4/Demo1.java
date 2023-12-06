package com.assignment4;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		
		String [] arr = {"Ritesh","anup"};
		
		List<String> ele = new ArrayList<String>();
		for(int i=0;i<arr.length;i++) {
			
			String str = arr[i];
			
			if(str.charAt(0)>=65 && str.charAt(0)<=90) {
				ele.add(str);
			}
			
			
			
		}
		
		for(String s : ele) {
			System.out.println(s);
		}
 
	}

}
