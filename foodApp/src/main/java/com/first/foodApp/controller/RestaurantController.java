package com.first.foodApp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.first.foodApp.model.Restaurant;
import com.first.foodApp.service.RestService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

		RestService restService;

		public RestaurantController(RestService restService) {
			super();
			this.restService = restService;
		}
		
		@PostMapping
		public String createRestaurant(@RequestBody Restaurant rest) {
			restService.createRestaurant(rest);
			return "Restaurant Successfully created";
		}
		@PutMapping
		public String updateRestaurant(@RequestBody Restaurant rest) {
			restService.updateRestauranr(rest);
			return "Restaurant Successfully created";
		}
		@GetMapping("{restId}")
		public Restaurant getRestById(@PathVariable("restId") Long restId) {
			return restService.getRestById(restId);
		}
		public List<Restaurant> getListOfRestaurants(){
			return restService.getListOfRestaurants();
		}
}
