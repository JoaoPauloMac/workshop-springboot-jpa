package com.springwebservices.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springwebservices.projeto.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
	
}
