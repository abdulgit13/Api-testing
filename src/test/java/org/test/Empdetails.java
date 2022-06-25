package org.test;

import java.util.ArrayList;

public class Empdetails {
	private String firstName;
	private String address;
	private ArrayList<Course> course;
	 
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ArrayList<Course> getCourse() {
		return course;
	}
	public void setCourse(ArrayList<Course> course) {
		this.course = course;
	}
	public Empdetails(String firstName, String address, ArrayList<Course> course) {
		super();
		this.firstName = firstName;
		this.address = address;
		this.course = course;
	}
	
	

}
