package com.first.foodApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.foodApp.model.Cart;

public interface CartRepo extends JpaRepository<Cart, Long>{

}
