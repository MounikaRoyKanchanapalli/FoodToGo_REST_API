package com.first.foodApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.foodApp.model.Item;

public interface ItemRepo extends JpaRepository<Item, Long>{

}
