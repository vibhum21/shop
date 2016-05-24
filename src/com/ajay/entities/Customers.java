package com.ajay.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="shopuser")
public class Customers {

	@Id
	@SequenceGenerator(name="useridgen", sequenceName="SEQ_SHOPUSER",allocationSize=1,initialValue=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="useridgen")
	@Column(name="USER_ID")
	private int id;
	@Column(name="USER_NAME")
	private String name;
	@Column(name="USER_EMAIL")
	private String email;

	@Column(name="USER_PASSWORD")
	private String password;
	@Column(name="USER_MOBILENO")
	private String mobile;
	@Column(name="USER_ADDRESS")
	private String address;
	@Column(name="USER_ROLE")
	private String role;
	
	public Customers() {
	this("","","","","","");
	}

	public Customers(String name, String email, String password, String mobile,
			String address,String role) {
		
		
		this.name = name;
		this.password = password;
		this.mobile = mobile;
		this.address = address;
		this.email = email;
		this.role=role;
	}
	
	

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Customers [id=" + id + ", name=" + name + ", email=" + email
				+ ", password=" + password + ", mobile=" + mobile
				+ ", address=" + address + ", role=" + role + "]";
	}

	
	
	
	
}
