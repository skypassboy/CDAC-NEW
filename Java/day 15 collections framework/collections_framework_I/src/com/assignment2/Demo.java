package com.assignment2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class Demo {

	public static void main(String[] args) throws Exception {
		
		
		Customer [] arr = new Customer[5];
		
		arr[0] = new RegisteredCustomer("Ritesh","ritesh@gmail.com",0123456789d,101);
		arr[1] = new Customer("Atharv","asp@gmail.com",9876543210d);
		arr[2] = new RegisteredCustomer("Anup","anup@gmail.com",5467891230d,103);
		arr[3] = new Customer("Gaurav","gaurav@gmail.com",0123456789d);
		arr[4] = new RegisteredCustomer("Ram","ram@gmail.com",5647821390d,105);
		
		
		ObjectOutputStream oos  = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Ritesh\\Desktop\\CDAC\\PG-DAC\\Java\\day 15 collections framework - I\\file collections-1\\Customer.txt"));
		
		for(Customer e : arr) {
			
			oos.writeObject(e);
			System.out.println("Object saved");
		}
		oos.close();
		
		
		
		
	}

}
