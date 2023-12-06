package com.assignment1;

import java.util.Objects;

public class Student {
	
	private int sid;
	private String name;
	private String city;
	private float percentage;
	
	
	public Student() {
		super();
	}


	public Student(int sid, String name, String city, float percentage) {
		super();
		this.sid = sid;
		this.name = name;
		this.city = city;
		this.percentage = percentage;
	}
	
	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public float getPercentage() {
		return percentage;
	}


	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}


	@Override
	public int hashCode() {
	    return Objects.hash(sid);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(city, other.city) && Objects.equals(name, other.name)
				&& Float.floatToIntBits(percentage) == Float.floatToIntBits(other.percentage)
				&& Objects.equals(sid, other.sid);
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", city=" + city + ", percentage=" + percentage + "]";
	}


	
	
	
	
	
	
}
