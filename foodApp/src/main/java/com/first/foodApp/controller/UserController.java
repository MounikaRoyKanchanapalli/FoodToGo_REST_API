package com.first.foodApp.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.first.foodApp.model.User;
import com.first.foodApp.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping()
	public ResponseEntity<List<User>> listOfUsers() {
		List<User> user = userService.getAllUsers();
		
		if(user != null)
		return new ResponseEntity<>(user,HttpStatus.OK);
		
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	@PostMapping
	public String createUser(@RequestBody User user) {
		
		userService.createUser(user);
		return "Created";
		
	}
	@GetMapping("{userId}")
	public ResponseEntity<User> getUser(@PathVariable("userId")Long userId) {
		User user = userService.getUser(userId);
		if(user != null)
		return new ResponseEntity<>(user, HttpStatus.OK);
			
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	@PutMapping
	public String updateUser(@RequestBody User user) {
		
		userService.updateUser(user);
		return "Updated";
		
	}
	
}
