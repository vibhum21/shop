package com.ajay.models;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Component
public class Login {
	@NotEmpty(message="email cannot be blank")
	@Email(message="invalid email format")
	private String email;
	@NotEmpty(message="password cannot be blank")
	private String password;
	public Login() {
		this.email = "";
		this.password = "";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [email=" + email + ", password=" + password + "]";
	}
}
