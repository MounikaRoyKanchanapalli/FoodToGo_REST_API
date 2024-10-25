package com.first.foodApp.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.first.foodApp.model.User;
import com.first.foodApp.repository.UserRepo;
import com.first.foodApp.service.UserService;

@Service
public class UserImpl implements UserService{

	UserRepo userRepo;
	
	
	public UserImpl(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}
	public String createUser(User user) {
		// TODO Auto-generated method stub
		userRepo.save(user);
		return "Success";
	}

	@Override
	public String updateUser(User user) {
		// TODO Auto-generated method stub
		
		userRepo.save(user);
		return "Updated";
	}


	@Override
	public User getUser(Long userId) {
		// TODO Auto-generated method stub
		return userRepo.findById(userId).orElse(null);
	}


}
