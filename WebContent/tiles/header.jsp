<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<h2>Online Shopping Portal</h2>

Hello, ${empty sessionScope.cust?'anonymous':sessionScope.cust.getName()}
<a href="index1" >${empty sessionScope.cust?'Sign In':'Sign Out' }</a>

<a href="showCart">Cart(${sessionScope.CART.size()})</a>

