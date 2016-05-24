package com.ajay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.dao.AddCustomerDao;
import com.ajay.entities.Customers;
import com.ajay.models.Customer;

@Service
public class CustomerRegisterService {

	@Autowired
	private AddCustomerDao dao;
	
	public void saveCustomer(Customers dbcustomer)
	{
		dao.addcustomer(dbcustomer);
	}
		
}
