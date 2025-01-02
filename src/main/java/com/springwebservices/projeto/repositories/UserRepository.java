package com.springwebservices.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springwebservices.projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
	
}