package com.first.foodApp.serviceImpl;

import org.springframework.stereotype.Service;

import com.first.foodApp.model.Address;
import com.first.foodApp.repository.AddressRepo;
import com.first.foodApp.service.AddressService;

@Service
public class AddressImpl implements AddressService{

	AddressRepo addressRepo;
	

	public AddressImpl(AddressRepo addressRepo) {
		super();
		this.addressRepo = addressRepo;
	}

	@Override
	public String createAddress(Address adr) {
		// TODO Auto-generated method stub
		addressRepo.save(adr);
		return "Created";
	}

	@Override
	public String updateAddress(Address adr) {
		// TODO Auto-generated method stub
		addressRepo.save(adr);
		return "Updated";
	}

	@Override
	public Address getAddress(Long addId) {
		// TODO Auto-generated method stub
		
		return addressRepo.findById(addId).get();
	}

}
