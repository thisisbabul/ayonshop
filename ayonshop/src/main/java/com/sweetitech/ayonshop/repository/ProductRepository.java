package com.sweetitech.ayonshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sweetitech.ayonshop.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	public Product findByName(Long id);
	public List<Product> findAll();
	
}
