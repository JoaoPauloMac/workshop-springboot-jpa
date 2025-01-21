package com.springwebservices.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springwebservices.projeto.entities.OrderItem;
import com.springwebservices.projeto.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
	
	
}
