package com.ajay.models;

import org.springframework.stereotype.Component;

@Component
public class Customer {


	private String name;
	private String password;
	private String mobile;
	private String address;
	private String email;
	private String role;
	public Customer() {
	
		
		this.name="";
		this.password="";
		this.mobile="";
		this.address="";
		this.email="";
		this.role="user";
	}

	

	public Customer(String name, String password, String mobile,
			String address, String email, String role) {
		super();
		this.name = name;
		this.password = password;
		this.mobile = mobile;
		this.address = address;
		this.email = email;
		this.role = role;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	@Override
	public String toString() {
		return "Customer [name=" + name + ", password=" + password
				+ ", mobile=" + mobile + ", address=" + address + ", email="
				+ email + ", role=" + role + "]";
	}



	
}