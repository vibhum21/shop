package com.ajay.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subcategory")

public class SubCategory {

	@Id
	@Column(name="SUBCATEGORY_ID")
	private int id;
	@Column(name="SUBCATEGORY_NAME")
	private String name;
	@Column(name="CATEGORY_NAME")
	private String category;
	public SubCategory() {
		this.id = 0;
		this.name = "";
		this.category = "";
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "subcategory [id=" + id + ", name=" + name + ", category="
				+ category + "]";
	}
	
	
	
}
