package com.cg.saloon.dto;

import java.math.BigInteger;

public class Customer {
	
	private int id ;
	private String name ;
	private String emailId ;
	private BigInteger mobileNumber ;
	public Customer(int id, String name, String emailId, BigInteger mobileNumber) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public BigInteger getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(BigInteger mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", emailId=" + emailId + ", mobileNumber=" + mobileNumber
				+ "]";
	}

	
	
}
