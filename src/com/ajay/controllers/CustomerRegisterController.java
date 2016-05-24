package com.ajay.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ajay.entities.Customers;
import com.ajay.models.Customer;
import com.ajay.services.CustomerRegisterService;


@Controller
public class CustomerRegisterController {

	@Autowired
   private CustomerRegisterService Service;	
	@RequestMapping("/register")
	public String showRegister(Model model)
	{
		Customer customer = new Customer();
		model.addAttribute("command", customer);
		return "customerRegister";
	}
	
	@RequestMapping("/addCustomer")
	public String addCustomer(@ModelAttribute("command") Customers customer, HttpSession session)
	{
		session.setAttribute("customer", customer);
		//Customer dbcustomer = new Customer(customer.getName(),customer.getEmail(),customer.getPassword(),customer.getMobile(),customer.getAddress(),customer.getRole());
		Service.saveCustomer(customer);
	
	    return "redirect:index";
	}
	
}
