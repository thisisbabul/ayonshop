package com.sweetitech.ayonshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sweetitech.ayonshop.entity.Product;
import com.sweetitech.ayonshop.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	public void save(Product product) {
		productRepository.save(product);		
	}

}
