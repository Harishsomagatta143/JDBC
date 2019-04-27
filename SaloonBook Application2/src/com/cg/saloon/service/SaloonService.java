package com.cg.saloon.service;

import java.util.List;

import com.cg.saloon.dto.Customer;
import com.cg.saloon.dto.Saloon;
import com.cg.saloon.exception.SaloonNotFoundException;

public interface SaloonService {

	
	public  Saloon addSaloon(Saloon sal);
	public  List<Saloon>searchByName(String name);
	public  Saloon assignCustomer(String name, Customer customer) throws SaloonNotFoundException;
	
}
