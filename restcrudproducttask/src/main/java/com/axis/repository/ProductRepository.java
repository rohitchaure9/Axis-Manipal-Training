package com.axis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axis.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
