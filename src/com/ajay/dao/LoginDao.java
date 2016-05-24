package com.ajay.dao;



import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ajay.entities.Customers;
@Repository
public class LoginDao {
	@Autowired
    private SessionFactory factory;
	
    @Transactional(readOnly=true)
    public Customers findCustomer(String email)
	{
		Session session = factory.getCurrentSession();
		Criteria cr = session.createCriteria(Customers.class);
		cr.add(Restrictions.eq("email", email));
		System.out.println("dwrere"+cr.uniqueResult());
		return (Customers) cr.uniqueResult();
	}

}
