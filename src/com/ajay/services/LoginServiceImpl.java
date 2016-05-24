package com.ajay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.dao.LoginDao;
import com.ajay.entities.Customers;
import com.ajay.models.Login;

@Service
public class LoginServiceImpl {

	@Autowired
	private LoginDao dao;
	
	public Customers vallidate(Login login)
	{ 
		Customers daoCust = dao.findCustomer(login.getEmail());
		//System.out.println(daoCust);
		if(daoCust == null || !daoCust.getPassword().equals(login.getPassword()))
			return null;
		return daoCust;
	}
}
