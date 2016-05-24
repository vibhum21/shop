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
import com.ajay.models.InsertProductAdmin;



@Repository
public class AdminDao {
	@Autowired
	private SessionFactory factory;
	
	@Transactional
	public void insertProduct(Product product)
	{
		Session session = factory.getCurrentSession();
		session.save(product);
	}
	
	

	@Transactional
	public List<Product> fetchProductDetail()
	{
		Session session=factory.getCurrentSession();
		Criteria cr=session.createCriteria(Product.class);
		return cr.list();
	}
	
	@Transactional(readOnly=true)
	public Product fetchProductById(int id)
	{
		Session session = factory.getCurrentSession();
		Criteria cr = session.createCriteria(Product.class);
		cr.add(Restrictions.eq("id", id));
		return (Product) cr.uniqueResult();
		
	}
	@Transactional
	public boolean deleteProduct(int product_id)
	{
		Session session=factory.getCurrentSession();
		String sql = "delete product where product_id=:p_product_id";
		SQLQuery query = session.createSQLQuery(sql);
		query.setLong("p_product_id",product_id );
		int result= query.executeUpdate();
		if(result!=0)
			return true;
		
		return false;
	}
	
	
	@Transactional
	public boolean updateProduct(InsertProductAdmin no)
	{
	
		Session session = factory.getCurrentSession();
		Product po = new Product(no.getProduct_name(),no.getProduct_brand(),no.getProduct_description(),no.getProduct_image(),no.getProduct_price(),no.getProduct_subcategory_name(),no.getProduct_quantity(),no.getProduct_rating());
		System.out.print("list dao..."+po);
		po.setProduct_id(no.getProduct_id());
		session.saveOrUpdate(po);
		
			return true;
		
		
	}
	
}
