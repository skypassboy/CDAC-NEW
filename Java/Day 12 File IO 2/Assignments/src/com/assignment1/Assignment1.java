package com.assignment1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Assignment1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f=null;
		String filename;
		BufferedReader br=null;
		InputStream is=null;
		br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter file name");
		filename = br.readLine();
		f= new File("C:\\CDAC_KnowIt\\"+filename);
		if(f.isDirectory())
		{
			File[] f1= f.listFiles();
			for(int i=0;i<f1.length;i++)
			System.out.println(f1[i]);
		}
		if(f.isFile())
		{
			is= new FileInputStream(f);
			if(f.length()>25)
			{
				int n;
				while((n= is.read())!=-1)
				{
					System.out.print((char)n);
				}
			}
			else
			{
				int n;
				while((n= is.read())!=-1)
				{
					System.out.print((char)n);
				}
			}
		}
	}

}

