package com.assignment3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmpSerialization {

	public static void main(String[] args) throws Exception{
		
	
		Emp [] allEmp = new Emp[3];
		
		allEmp[0] = new SalesMananger("Ritesh", new Date(12,5,2023), 101, 100000, 200, 20);
		allEmp[1] = new Programmer("ASP", new Date(12,6,2023), 102, 90000, 20, 500);
		allEmp[2] = new Admin("Ram",new Date(12,06,1999),103,50000,10000);
		
		
		ObjectOutputStream oos  = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Ritesh\\Desktop\\CDAC\\PG-DAC\\Java\\Day 12 File IO 2\\Assignments\\src\\com\\assignment3\\EmpSerialization\\EmpSerialization.txt"));
		
		for(Emp e : allEmp) {
			
			oos.writeObject(e);
			System.out.println("Object saved");
		}
		oos.close();
	
	}

}
