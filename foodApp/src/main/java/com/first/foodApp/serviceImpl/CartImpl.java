package com.first.foodApp.serviceImpl;

import org.springframework.stereotype.Service;

import com.first.foodApp.model.Cart;
import com.first.foodApp.repository.CartRepo;
import com.first.foodApp.service.CartService;

@Service
public class CartImpl implements CartService{
	
	CartRepo cartRepo;
	
	
	public CartImpl(CartRepo cartRepo) {
		super();
		this.cartRepo = cartRepo;
	}

	@Override
	public String createCart(Cart cart) {
		// TODO Auto-generated method stub
		cartRepo.save(cart);
		return "cart created";
	}

	@Override
	public String updateCart(Cart cart) {
		// TODO Auto-generated method stub
		cartRepo.save(cart);
		return "cart updated";
	}

	@Override
	public Cart getCartById(Long cartId) {
		// TODO Auto-generated method stub
		return cartRepo.findById(cartId).get();
	}

	@Override
	public String deleteCartById(Long cartId) {
		// TODO Auto-generated method stub
		cartRepo.deleteById(cartId);
		return "Cart Deleted";
	}

}
