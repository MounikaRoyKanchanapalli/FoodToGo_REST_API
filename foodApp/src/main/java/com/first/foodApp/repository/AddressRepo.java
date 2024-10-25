package com.first.foodApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.foodApp.model.Address;

public interface AddressRepo extends JpaRepository<Address, Long>{

}
