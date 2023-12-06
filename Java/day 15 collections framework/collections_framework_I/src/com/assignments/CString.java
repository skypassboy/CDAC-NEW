package com.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CString {
	
	
	
	public static void main(String args[]) {
		
		
		List<String> l1 = new ArrayList<String>();
		
		l1.add("Patil");
		l1.add("Ritesh");
		l1.add("Kolhapur");
		l1.add("Maharashtra");
		l1.add("Bharat");
		for(String i : l1) {
			System.out.println(i);
		}
		
		l1.remove(3);
		
//		advanced for loop
		System.out.println("**************** display using advanced for loop ****************");
		for(String i : l1) {
			System.out.println(i);
		}
//		size
		System.out.println("**************** display using size ****************");
		System.out.println(l1.size());
		System.out.println("**************** display using iterator ****************");
		 Iterator<String> el = l1.iterator();
		 
		 while(el.hasNext()) {
			 System.out.println(el.next());
		 }
		 
		 System.out.println("**************** display reverse using ListIterator ****************");
		
		 ListIterator<String> ele = l1.listIterator();
		 
		 while(ele.hasNext()) {
			 ele.next();
		 }
		 
		 while(ele.hasPrevious()) {
			 System.out.println(ele.previous());
		 }
		 
		 System.out.println("**************** display using forEach method ****************");
		 
		 l1.forEach((String s)->System.out.println(s));
		 
		 
		 System.out.println("**************** sort ****************");
		 
		 Collections.sort(l1);
		 
		 l1.forEach((String s)->System.out.println(s));
		 
		 System.out.println("**************** contains ****************");
		 String data = "Ritesh";
		 
		 if(l1.contains(data)) {
			 System.out.println("Present at index "+l1.indexOf(data));
		 }
		 else {
			 System.out.println("Not present");
		 }
		 
		 
	}
	
	
	
}
