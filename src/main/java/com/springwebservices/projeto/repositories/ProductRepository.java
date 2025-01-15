package com.springwebservices.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springwebservices.projeto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
	
}
