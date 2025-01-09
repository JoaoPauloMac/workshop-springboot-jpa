package com.springwebservices.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springwebservices.projeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
	
}
