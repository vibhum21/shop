package com.ajay.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="subcategory")
public class Categories {
	@Id
	@SequenceGenerator(name="categoryidgenerator", sequenceName="seq_categoryid ",allocationSize=1,initialValue=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="categoryidgenerator")
private int subcategory_id;
	@Column(name="SUBCATEGORY_NAME")
private String subcategory_name;
	@Column(name="CATEGORY_NAME")
private String category_name;
public Categories()
{
	this(0,"","");
}
public Categories(int subcategory_id, String subcategory_name,String category_name) {
	this.subcategory_id = subcategory_id;
	this.subcategory_name=subcategory_name;
	this.category_name = category_name;
}
public int getSubCategory_id() {
	return subcategory_id;
}
public void setSubCategory_id(int subcategory_id) {
	this.subcategory_id = subcategory_id;
}
public String getCategory_name() { 
	return category_name;
}
public void setCategory_name(String category_name) {
	this.category_name = category_name;
}

public String getSubcategory_name() {
	return subcategory_name;
}
public void setSubcategory_name(String subcategory_name) {
	this.subcategory_name = subcategory_name;
}
@Override
public String toString() {
	return "Categories [subcategory_id=" + subcategory_id
			+ ", subcategory_name=" + subcategory_name + ", category_name="
			+ category_name + "]";
}

}
