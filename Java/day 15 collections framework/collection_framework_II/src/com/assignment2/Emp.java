package com.assignment2;

public class Emp implements Comparable<Emp> {
	
	private String name;
	private double salary;
	
	public Emp() {
		
	}
	
	public Emp(String name,double salary ) {
		
		this.name = name;
		this.salary = salary;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "name=" + name + ", salary=" + salary +" ";
	}

	@Override
	public int compareTo(Emp o) {
		
		if(this.salary>o.salary)
			return -1;
		else if(this.salary<o.salary)
			return 1;
		else if(this.salary==o.salary) {
			
			if(!(this.name.equals(o.name))) {
				return 1;
			}
			else {
				return 0;
			}
			
		}
		else {
			return 0;
		}
	}
	

	
}
