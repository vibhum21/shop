	package com.ajay.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ajay.entities.Customers;
import com.ajay.models.Login;
import com.ajay.services.LoginServiceImpl;

@Controller
public class LoginController {

	@Autowired
	private LoginServiceImpl service;
	/*@RequestMapping("/index")
	public String showLogin(Model model)
	{
		Login login = new Login();
		model.addAttribute("command", login);
		return "index";
	}*/
	@RequestMapping("/login")
	public String showLoginPage(Model model,HttpSession session)
	{
		Login login = new Login();
		model.addAttribute("command", login);
		session.removeAttribute("cust");
		return "login";
	}
	
	@RequestMapping("/checklogin")
	public String checkLogin(@Valid @ModelAttribute("command")  Login login ,BindingResult res,HttpSession session)
	{
		Customers cust = service.vallidate(login);
		session.setAttribute("cust", cust);
		   
		
		
		System.out.println(login);
		System.out.println(cust);
		if(res.hasErrors())
		{
			return "login"; 
		}
		if(cust == null)
			return "relogin";
		if(cust.getRole().equals("admin"))
			
			return "admin";
		return "redirect:index";
	}
	
}
