package com.ajay.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.dao.CategoryDao;
import com.ajay.entities.Categories;
import com.ajay.entities.Product;
import com.ajay.entities.SubCategory;

@Service
public class CategoryService {
	@Autowired
	private CategoryDao dao;
	
	public List<String> fetchCategories()
	{
		return dao.fetchCategoryDetails();
	}
	public List<Categories> fetchSubCategory(String category_name)
	{
		System.out.println(category_name);
		return dao.fetchSubCategoryDetails(category_name);
	}
	
	public List<Product> fetchproduct(String product_subcategory_name)
	{
		return dao.fetchproduct(product_subcategory_name);
	}
	
	public Product fetchProductByIdforview(int id)
	{
		return dao.fetchProductByIdforview(id);
	}
}
