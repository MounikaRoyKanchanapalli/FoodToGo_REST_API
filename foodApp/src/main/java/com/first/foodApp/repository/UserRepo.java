package com.first.foodApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.foodApp.model.User;


public interface UserRepo extends JpaRepository<User, Long>{

	
}
