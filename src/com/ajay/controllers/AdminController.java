package com.ajay.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ajay.entities.Product;
import com.ajay.entities.SubCategory;
import com.ajay.models.InsertProductAdmin;
import com.ajay.services.AdminService;


@Controller
public class AdminController {
	@Autowired
	private AdminService service;
	
	@RequestMapping("/insert")
	public String insert(Model model)
	{
	  InsertProductAdmin in = new InsertProductAdmin();
	  model.addAttribute("command",in);
		System.out.println(in);
		return "admin";
	}
	@RequestMapping("/addProduct")
	public String insertProduct(@ModelAttribute("command") InsertProductAdmin in)
	{
	  Product product = new Product(in.getProduct_name(),in.getProduct_brand(),in.getProduct_description(),in.getProduct_image(),in.getProduct_price(),in.getProduct_subcategory_name(),in.getProduct_quantity(),in.getProduct_rating());
		service.insertProduct(product);
		System.out.println(product);
		return "admin";
	}
	
	@RequestMapping("/viewproduct")
	public String ProductDetails(Model model)
	{
		List<Product> productlist=service.fetchProduct();
		model.addAttribute("productlist", productlist);
		return "admin";
	}
	
	
	
	@RequestMapping("/edit")
	public String UpdateProduct(InsertProductAdmin no)
	{
		boolean status = service.editProduct(no);
		if(status == true)
			return "redirect:viewproduct";
		else 
			return "redirect:viewproduct";
	}
	
	
	@RequestMapping("/fetchEditProductById")
	public String moviedetailsbyidAdmin(Model model, @RequestParam(value="id",required=false) int id)
	{
		Product product = service.fetchProductById(id);
		
		model.addAttribute("product",product);
		
		System.out.print("list isaaaaaaa"+product);
		return "editform";
	}

	
	@RequestMapping("/delete")
	public String deleteproductdetail(Model model,@RequestParam(value="id",required=false)int id)
	{
		List<Product> productlist=service.fetchProduct();
		model.addAttribute("productlist", productlist);
		//return "redirect:admin";
		boolean status=service.deleteProduct(id);
		if(status == true)
			return "redirect:viewproduct";
		else 
			return "redirect:viewproduct";
	}
}
