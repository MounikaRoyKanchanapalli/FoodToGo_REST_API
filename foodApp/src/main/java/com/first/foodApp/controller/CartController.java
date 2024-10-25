package com.first.foodApp.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.first.foodApp.model.Cart;
import com.first.foodApp.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

	CartService cartService;
	
	public CartController(CartService cartService) {
		super();
		this.cartService = cartService;
	}

	@PostMapping
	public String createCart(@RequestBody Cart cart) {
		cartService.createCart(cart);
		return "cart created";
		}
	@PutMapping
	public String updateCart(@RequestBody Cart cart) {
		cartService.updateCart(cart);
		return "cart updated";
		}
	@GetMapping("{cartId}")
	public Cart getCartById(Long cartId) {
		return cartService.getCartById(cartId);
	}
	@DeleteMapping("{cartId}")
	public String deleteCartById(Long cartId) {
		 cartService.deleteCartById(cartId);
		 return "Deleted Cart";
	}
}
