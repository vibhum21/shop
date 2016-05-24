package com.ajay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.dao.CartDao;
import com.ajay.entities.Product;



@Service
public class CartService {
	@Autowired
	private CartDao dao;
	
	
	public Product getprice(int id)
	{
		
		return dao.fetchPriceObj(id);
		
	}
	

}
