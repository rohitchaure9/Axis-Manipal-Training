package com.axis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.entity.Product;
import com.axis.exception.IdNotFoundException;
import com.axis.exception.InValidPriceException;
import com.axis.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		if(product.getPrice()<0)
		{
			throw new InValidPriceException("Enter price in positive.");
		}
	    return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		Optional<Product> emp = productRepository.findById(id);
		if(emp.isPresent())
		{
			return emp.get();
		}
		else {
			throw new IdNotFoundException("No id present to get the value");
		}
		
	}

	@Override
	public Product updateProductById(int id, Product product) {
		// TODO Auto-generated method stub
		Optional<Product> emp = productRepository.findById(id);
		if(emp.isPresent())
		{
			return productRepository.save(product);
		}
		else {
			throw new IdNotFoundException("No id present to get the value");
		}
	}

	@Override
	public String deleteProductById(int id) {
		// TODO Auto-generated method stub
		Optional<Product> emp = productRepository.findById(id);
		if(emp.isPresent())
		{
			productRepository.deleteById(id);
			return "Employee Deleted";
		}
		else {
			throw new IdNotFoundException("No id present to get the value");
		}
	}

	
	

}
