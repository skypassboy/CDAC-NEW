package com.assignment2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapImplementation {

	public static void main(String[] args) {
		
		
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		
		map.put("Ritesh",10);
		map.put("Nikhil", 15);
		map.put("Anup", 20);
		map.put("Aniket", 30);
		
		System.out.println(map);
		
		Set<Map.Entry<String,Integer>> set = map.entrySet();
		
		Iterator<Map.Entry<String,Integer>> iobj = set.iterator();
		
		while(iobj.hasNext()) {
			Map.Entry<String,Integer> me  = iobj.next();
			System.out.println(me.getKey()+" : "+me.getValue());
		}
		
		

	}

}
