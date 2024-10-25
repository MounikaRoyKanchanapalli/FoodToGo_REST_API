package com.first.foodApp.service;

import java.util.List;

import com.first.foodApp.model.Restaurant;

public interface RestService {

	public String createRestaurant(Restaurant rest);
	public String updateRestauranr(Restaurant rest);
	public Restaurant getRestById(Long restId);
	public List<Restaurant> getListOfRestaurants();
	public String deleteRestaurant(Long restId);
}
