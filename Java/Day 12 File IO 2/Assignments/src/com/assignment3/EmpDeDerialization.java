package com.assignment3;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EmpDeDerialization {

	public static void main(String[] args) throws Exception{
		
		
		Emp []empty = new Emp[3];
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Ritesh\\Desktop\\CDAC\\PG-DAC\\Java\\Day 12 File IO 2\\Assignments\\src\\com\\assignment3\\EmpSerialization\\EmpSerialization.txt"));
		
		for(int i=0;i<empty.length;i++) {
			Object o = ois.readObject();
			if(o instanceof Emp) {
				empty[i] = (Emp)o;
			}
		}
		
		for(Emp e : empty) {
			System.out.println(e);
		}
		ois.close();
	}

}
