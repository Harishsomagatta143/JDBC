package com.cg.saloon.service;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cg.saloon.dao.SaloonDao;
import com.cg.saloon.dao.SaloonDaoImpl;
import com.cg.saloon.dto.Customer;
import com.cg.saloon.dto.Saloon;
import com.cg.saloon.exception.SaloonNotFoundException;

public class SaloonServiceImpl implements SaloonService {
	//SaloonDaoImpl sal=new SaloonDaoImpl();
SaloonDao dao;
public SaloonServiceImpl() {
	dao=new SaloonDaoImpl();
}
@Override
public Saloon addSaloon(Saloon sal) {
	return dao.save(sal);
}

@Override
public List<Saloon> searchByName(String name) {
	return dao.findByName(name);
}
@Override
public Saloon assignCustomer(String name, Customer customer) throws SaloonNotFoundException {
	// TODO Auto-generated method stub
	List<Saloon> saloon=dao.findByName(name);
	for (Saloon saloon2 : saloon) {
		if(saloon2.getName().equals(name)) {
		List<Customer> customerList=saloon2.getCustomerList();
		customerList.add(customer);
		saloon2.setCustomerList(customerList);
		return saloon2;}}
	if(saloon.isEmpty())
		throw new SaloonNotFoundException("saloon not found exception");
	return null;
}	

}
