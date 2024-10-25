package com.first.foodApp.service;

import com.first.foodApp.model.Cart;

public interface CartService {

	public String createCart(Cart cart);
	public String updateCart(Cart cart);
	public Cart getCartById(Long cartId);
	public String deleteCartById(Long cartId);
}
