package com.first.foodApp.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.first.foodApp.model.Restaurant;
import com.first.foodApp.repository.RestRepo;
import com.first.foodApp.service.RestService;

@Service
public class RestImpl implements RestService{

	RestRepo restRepo;
	
	
	public RestImpl(RestRepo restRepo) {
		super();
		this.restRepo = restRepo;
	}

	@Override
	public String createRestaurant(Restaurant rest) {
		// TODO Auto-generated method stub
		restRepo.save(rest);
		return "Restaurant Created";
	}

	@Override
	public String updateRestauranr(Restaurant rest) {
		// TODO Auto-generated method stub
		restRepo.save(rest);
		return "Restaurant Updated";
	}

	

	@Override
	public List<Restaurant> getListOfRestaurants() {
		// TODO Auto-generated method stub
		return restRepo.findAll();
	}

	@Override
	public Restaurant getRestById(Long restId) {
		// TODO Auto-generated method stub
		return restRepo.findById(restId).get();
	}

	@Override
	public String deleteRestaurant(Long restId) {
		// TODO Auto-generated method stub
		restRepo.deleteById(restId);
		return "Deleted the Restaurant";
	}

	

}
