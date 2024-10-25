package com.first.foodApp.service;


import com.first.foodApp.model.Address;

public interface AddressService {

	public String createAddress(Address adr);
	public String updateAddress(Address adr);
	public Address getAddress(Long addId);
	
}
