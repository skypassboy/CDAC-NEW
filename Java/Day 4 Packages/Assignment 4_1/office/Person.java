package office.staff;

import office.utility.Date;

public class Person{
	
	private String name;
	private Date bdate;

	public Person(){
		name = "-";
		bdate = new Date();
	}
	
	public Person(String name, Date bdate){
		this.name = name;
		this.bdate = bdate;
	}
	
	public void display(){

		System.out.println("Name : "+ name);
		System.out.print("Birth Date : ");
		bdate.display();

	}



}