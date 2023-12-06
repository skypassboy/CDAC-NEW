package com.assignments;

public class Book{
	
	int bno;
	String name;
	public Book()
	{

	}
	public Book(int bno,String nm)
	{
		this.bno=bno;
		this.name=nm;
	}
	public String toString()
	{
		return bno+"\t"+name;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
