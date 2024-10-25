package com.first.foodApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.first.foodApp.repository.AddressRepo;
import com.first.foodApp.service.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	AddressRepo addressRepo;
	@Autowired
	AddressService addressService;

}
