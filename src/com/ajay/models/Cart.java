package com.ajay.models;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

@Component
	public class Cart 
	{
		HttpSession mysession;
		private List<Integer> cartlist;
		
	public Cart()
	{
		this.cartlist=new ArrayList<Integer>();
	}

	public List<Integer> getCartlist() {
		return cartlist;
	}

	public void setCartlist(List<Integer> cartlist) {
		for (Integer integer : cartlist)
		{
			System.out.println();
		}
		
		this.cartlist = cartlist;
		
		
		
	}
		
	public void addToCart(String[] items,HttpSession localSession)
	{
		List<Integer> idList=(List<Integer>)localSession.getAttribute("cartList");
		if(idList==null)
		{	
			for (String id : items)
			{
				int id1=Integer.parseInt(id);
				idList.add(id1);
			}
		}
		localSession.setAttribute("cartList", idList);
		this.setCartlist(idList);
	}
	}
