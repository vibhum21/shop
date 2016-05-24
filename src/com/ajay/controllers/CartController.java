package com.ajay.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ajay.entities.Product;
import com.ajay.services.CartService;

@Controller
public class CartController {

	@Autowired
	private CartService service;
	private List<Product> list;
	List<Integer> cartlist=new ArrayList<Integer>();
	
	@RequestMapping("/addtocart")
	public String addcart(Model model,@RequestParam(value="productid",required=false) int product_id,HttpSession session)
	{
		//int id1=(product.getProduct_id());
		System.out.println("id is....."+product_id);
		cartlist.add(product_id);
		
		for(Integer integer : cartlist)
		{
			System.out.println(integer);
		}
		session.setAttribute("cartlist",cartlist);
		System.out.println("ad list"+cartlist);
		return"redirect:index";
	}
	
	@RequestMapping("/showCart")
	public String addtocart(Model model,HttpSession session)
	{
		double total=0;
		List<Integer> idlist=(List<Integer>) session.getAttribute("cartlist");
		List<Product> showcatlist=new ArrayList<Product>();
		
		for(Integer integer : idlist)
		{
			Product productitem=service.getprice(integer);
			total=total+productitem.getProduct_price();
			showcatlist.add(productitem);
		}
		session.setAttribute("total",total);
		model.addAttribute("showcatlist", showcatlist);
		return "cart";
	}
	@RequestMapping("/removecart")
	public String removecart(Model model, Product product,HttpSession session)
	{
		int product_id=(product.getProduct_id());
		System.out.println("listttttttttt"+cartlist);
		cartlist.remove(product_id);
		System.out.println("list isssssssss"+cartlist);
		session.setAttribute("cartlist", cartlist);
		return "redirect:showCart";
	}
}
