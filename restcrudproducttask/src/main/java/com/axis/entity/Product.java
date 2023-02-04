package com.axis.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //creates table
@Table(name="products")   //changed the table name because we are having same table before in database
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto increments value
	private int id;
	private String name;
	private String description;
	private int price;
	private int category;
	
	public Product() {
		super();
	}
	
	public Product(int id, String name, String description, int price, int category) {
		super();
		this.id=id;
		this.name=name;
		this.description=description;
		this.price=price;
		this.category=category;
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

	public String getDescription() {
		return description;
	}

	public void setdescription(String dept) {
		this.description = dept;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getCategory() {
		return category;
	}
	
	public void setCategory(int category) {
		this.category=category;
	}
}
