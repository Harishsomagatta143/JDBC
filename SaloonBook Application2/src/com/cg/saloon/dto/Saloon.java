package com.cg.saloon.dto;


import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public class Saloon {
	
	private int id;
	private String name;
	private Address address; 
	private BigInteger phoneNumber; 
	private  List<Customer> customerList;
	public Saloon(int id, String name, Address address, BigInteger phoneNumber,List<Customer> customerList) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.customerList = customerList;
	}

	public Saloon() {

	}

	public Saloon(int saloonId, String name2, String address2, String phnumber) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public BigInteger getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(BigInteger phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	@Override
	public String toString() {
		return "Saloon [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ",customerList=" + customerList + "]";
	}
	public String getString() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	
}
