package com.ajay.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ajay.entities.Categories;
import com.ajay.entities.Product;
import com.ajay.entities.SubCategory;

@Repository
public class CategoryDao {
	@Autowired
	private SessionFactory factory;
	
	@Transactional(readOnly=true)
	public List<String> fetchCategoryDetails()
	{
		Session session = factory.getCurrentSession();
		String sql = "select distinct category_name from subcategory";
		SQLQuery query = session.createSQLQuery(sql);
		return query.list();
	}
	
	
   @Transactional(readOnly=true)
   public List<Product> fetchproduct(String product_subcategory_name)
   {
	   Session session=factory.getCurrentSession();
	   
	   Criteria cr=session.createCriteria(Product.class);
	   cr.add(Restrictions.eq("product_subcategory_name", product_subcategory_name));
	   return cr.list();
   }
    
	@Transactional
	public List<Categories> fetchSubCategoryDetails(String category_name)
	{
		Session session=factory.getCurrentSession();
		System.out.println(category_name);
		Criteria cr = session.createCriteria(Categories.class);
		cr.add(Restrictions.eq("category_name", category_name));
		return cr.list();
	}
	
	@Transactional(readOnly=true)
	public Product fetchProductByIdforview(int id)
	{
		Session session = factory.getCurrentSession();
		Criteria cr = session.createCriteria(Product.class);
		cr.add(Restrictions.eq("id", id));
		return (Product) cr.uniqueResult();
		
	}
}
