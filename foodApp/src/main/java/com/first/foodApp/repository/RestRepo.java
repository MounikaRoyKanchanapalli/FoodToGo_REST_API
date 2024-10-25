package com.first.foodApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.foodApp.model.Restaurant;

public interface RestRepo extends JpaRepository<Restaurant, Long>{

}
