package com.ajay.dao;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ajay.entities.Customers;
import com.ajay.models.Customer;

@Repository
public class AddCustomerDao {

	@Autowired
    private SessionFactory factory;
	
	@Transactional
	public void addcustomer(Customers dbcustomer)
	{
		System.out.println(dbcustomer);
		Session session = factory.getCurrentSession();
		int id = (Integer) session.save(dbcustomer);
	   if(id != 0)
	   {
		   System.out.println("id is :" +id +"inserted");
	   }
	}
}