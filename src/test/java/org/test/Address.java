package org.test;

public class Address {
	private String streetName;
	private String district;
	private String state;
	
	public Address(String streetName, String district, String state) {
		super();
		this.streetName = streetName;
		this.district = district;
		this.state = state;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
	

}
