package com.cg.saloon.dto;

public class Address {

    private String city;
    private String state; 
    private long postalcode;
	public Address(String city, String state, long postalcode) {
		super();
		this.city = city;
		this.state = state;
		this.postalcode = postalcode;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(long postalcode) {
		this.postalcode = postalcode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", postalcode=" + postalcode + "]";
	}
    
    
}
