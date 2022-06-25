package org.test;

import java.util.ArrayList;
import java.util.List;

public class PojoClass43 {
	private String name;
	private String email;
	private long phoneNo;
	private ArrayList<Course> courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public ArrayList<Course> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	public PojoClass43(String name, String email, long phoneNo, ArrayList<Course> courses) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.courses = courses;
	}
	 
}



