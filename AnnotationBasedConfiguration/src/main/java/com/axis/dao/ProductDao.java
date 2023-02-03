package com.axis.dao;

import org.springframework.stereotype.Component;

@Component   //by using this automatically like bean it will configure class like <bean name=""....
public class ProductDao {
	public void databaseLayer() {
		System.out.println("Use to access the data from database.");
	}

}
