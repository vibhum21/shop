package com.ajay.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ajay.entities.Categories;
import com.ajay.entities.Product;
import com.ajay.entities.SubCategory;
import com.ajay.services.CategoryService;

@Controller
public class CategoryController {
	@Autowired
	private CategoryService service;
	
	@RequestMapping("/index")
	public String categoryDetails(Model model,@RequestParam(value="category_name",required=false) String category_name,@RequestParam(value="subcategory" ,required=false)String product_subcategory_name)
	{
		List<String> categorylist = service.fetchCategories();
		System.out.println(categorylist);
		model.addAttribute("categorylist",categorylist);
		if(category_name != null)
		{
			List<Categories> subcategorylist = service.fetchSubCategory(category_name);
			System.out.println("ddddddddd"+product_subcategory_name);
			model.addAttribute("subcategorylist",subcategorylist);

		}
		
		if(product_subcategory_name != null)
		{
			List<Product> productlist=service.fetchproduct(product_subcategory_name);
			System.out.println("a gai list"+productlist);
			model.addAttribute("productlist", productlist);
		}
		System.out.println("here");
		
		return "index";
	}
	
	@RequestMapping("/viewproductinfo")
	public String fetchproduct(Model model,@RequestParam(value="product",required=false)int product_id)
	{
		System.out.print("id is........"+product_id);
			Product product = service.fetchProductByIdforview(product_id);
			model.addAttribute("product",product);
			return "viewproduct";
		}
	}


