package com.ajay.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.dao.AdminDao;
import com.ajay.entities.Product;
import com.ajay.models.InsertProductAdmin;

@Service
public class AdminService {
	@Autowired
	private AdminDao dao;
	
	public void insertProduct(Product product)
	{
		dao.insertProduct(product);
	}

	public Boolean editProduct(InsertProductAdmin no)
	{
		System.out.print("list service............"+no);
		return dao.updateProduct(no);
	}
	public boolean deleteProduct(int product_id)
	{
		return dao.deleteProduct(product_id);
	}

	public List<Product> fetchProduct()
	{
		return dao.fetchProductDetail();
	}
	public Product fetchProductById(int id)
	{
		return dao.fetchProductById(id);
	}
}
