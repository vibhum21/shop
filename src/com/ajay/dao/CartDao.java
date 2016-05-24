package com.ajay.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ajay.entities.Product;


@Repository
public class CartDao {

	@Autowired
	private SessionFactory factory;
	
	@Transactional(readOnly=true)
	public Product fetchPriceObj(int id)
	{
		Session session=factory.getCurrentSession();
		Criteria cr=session.createCriteria(Product.class);
		cr.add(Restrictions.eq("id",id));
		return (Product) cr.uniqueResult();

	}
}

