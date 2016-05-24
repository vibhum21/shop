package com.ajay.models;

import org.springframework.stereotype.Component;

@Component
public class SubCategory {
private int subcategory_id;
private String subcategory_name;
private String category_name;
public SubCategory()
{
	this(0,"","");
}
public SubCategory(int subcategory_id, String subcategory_name,
		String category_name) {
	super();
	this.subcategory_id = subcategory_id;
	this.subcategory_name = subcategory_name;
	this.category_name = category_name;
}

public int getSubcategory_id() {
	return subcategory_id;
}

public void setSubcategory_id(int subcategory_id) {
	this.subcategory_id = subcategory_id;
}

public String getSubcategory_name() {
	return subcategory_name;
}

public void setSubcategory_name(String subcategory_name) {
	this.subcategory_name = subcategory_name;
}

public String getCategory_name() {
	return category_name;
}

public void setCategory_name(String category_name) {
	this.category_name = category_name;
}

@Override
public String toString() {
	return "SubCategory [subcategory_id=" + subcategory_id
			+ ", subcategory_name=" + subcategory_name + ", category_name="
			+ category_name + "]";
}

}
