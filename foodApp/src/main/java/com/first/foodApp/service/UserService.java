package com.first.foodApp.service;

import java.util.List;

import com.first.foodApp.model.User;



public interface UserService {
	List<User> getAllUsers();
	public String createUser(User user);
	public String updateUser(User user);
	public User getUser(Long userId);
}

