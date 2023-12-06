package com.assignment2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DemoDeSerialize {

	public static void main(String[] args) throws Exception {
		
		List<Customer> customers = new ArrayList<Customer>();
		
		List<RegisteredCustomer> regCustomer = new ArrayList<RegisteredCustomer>();
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Ritesh\\Desktop\\CDAC\\PG-DAC\\Java\\day 15 collections framework - I\\file collections-1\\Customer.txt"));
		
		while(true) {
			try {
				Object o = ois.readObject();
				
				if(o instanceof Customer) {
					customers.add((Customer) o);
				}
				else {
					regCustomer.add((RegisteredCustomer)o);
				}
			}
			catch(Exception e) {
				break;
			}
			
		}
		
		for(Customer c : customers) {
			System.out.println(c);
		}
		for(Customer c : regCustomer) {
			System.out.println(c);
		}
		ois.close();
	}

}
