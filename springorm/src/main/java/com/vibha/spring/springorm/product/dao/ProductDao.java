package com.vibha.spring.springorm.product.dao;

import java.util.List;

import com.vibha.spring.springorm.product.entity.Product;

public interface ProductDao {
	
	int create(Product product);
	void update(Product product);
	void delete(Product product);
	Product find(int id);
	List<Product> findAll();

}
