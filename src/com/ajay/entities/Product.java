package com.ajay.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="product")

public class Product {
	 @Id
	   @SequenceGenerator(name="productidgenerator", sequenceName="SEQ_PRODUCTID ",allocationSize=1,initialValue=1)
		@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="productidgenerator")
	  @Column(name="PRODUCT_ID")
	private int product_id;
	 @Column(name="PRODUCT_NAME")
	private String product_name;
	 @Column(name="PRODUCT_BRAND")
	private String product_brand;
	 @Column(name="PRODUCT_DESCRIPTION")
	private String product_description;
	 @Column(name="PRODUCT_IMAGE")
	private String product_image;
	 @Column(name="PRODUCT_PRICE")
	private double product_price;
	 @Column(name="PRODUCT_SUBCATEGORY_NAME")
	private String product_subcategory_name;
	 @Column(name="PRODUCT_QUANTITY")
	private int product_quantity;
	 @Column(name="PRODUCT_RATING")
	private int product_rating;
	 public Product() {
			this("","","","",0.0,"",0,0);
		}

	public Product(String product_name, String product_brand,
			String product_description, String product_image,
			double product_price, String product_subcategory_name,
			int product_quantity,int product_rating) {
		super();
		this.product_name = product_name;
		this.product_brand = product_brand;
		this.product_description = product_description;
		this.product_image = product_image;
		this.product_price = product_price;
		this.product_subcategory_name = product_subcategory_name;
		this.product_quantity = product_quantity;
		this.product_rating=product_rating;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_brand() {
		return product_brand;
	}

	public void setProduct_brand(String product_brand) {
		this.product_brand = product_brand;
	}

	public String getProduct_description() {
		return product_description;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	public String getProduct_image() {
		return product_image;
	}

	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}

	public double getProduct_price() {
		return product_price;
	}

	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}

	public String getProduct_subcategory_name() {
		return product_subcategory_name;
	}

	public void setProduct_subcategory_name(String product_subcategory_name) {
		this.product_subcategory_name = product_subcategory_name;
	}

	public int getProduct_quantity() {
		return product_quantity;
	}

	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}

	public int getProduct_rating() {
		return product_rating;
	}

	public void setProduct_rating(int product_rating) {
		this.product_rating = product_rating;
	}

	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name="
				+ product_name + ", product_brand=" + product_brand
				+ ", product_description=" + product_description
				+ ", product_image=" + product_image + ", product_price="
				+ product_price + ", product_subcategory_id="
				+ product_subcategory_name + ", product_quantity="
				+ product_quantity + ", product_rating=" + product_rating + "]";
	}
	
	
}
	