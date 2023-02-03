package com.axis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.axis.dao.ProductDao;


@Component
public class ProductService {
	
	@Autowired
	ProductDao productDao;
	
	public void productServiceLayer() {
		productDao.databaseLayer();
		System.out.println("Writing business logic.");
	}
}
