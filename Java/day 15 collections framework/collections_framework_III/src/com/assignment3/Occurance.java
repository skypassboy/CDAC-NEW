package com.assignment3;

import java.util.HashMap;
import java.util.Map;

public class Occurance {

	public static void main(String[] args) {
		
		
			String str = "cocacola";
			
			Map<Character, Integer> mapChar = new HashMap<Character, Integer>();
			
			for(int i=0;i<str.length();i++) {
				
				char ch = str.charAt(i);
				
				
				if(mapChar.containsKey(ch)) {
					
					int occ = mapChar.get(ch);
					occ++;
					mapChar.replace(ch,occ);
					
				}
				else {
					mapChar.put(ch, 1);
				}

			}
			
			System.out.println(mapChar);
			

	}
	
	

}
