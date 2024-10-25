package com.first.foodApp.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long cartId;
	
	@OneToOne(cascade = CascadeType.ALL)
	
	private User user;
	
	@OneToMany(targetEntity = Item.class,cascade = CascadeType.ALL)
	private List<Item> itemList;
	
	

	public Cart(Long cartId, User user, List<Item> itemList) {
		super();
		this.cartId = cartId;
		this.user = user;
		this.itemList = itemList;
	}
	
	

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", user=" + user + ", itemList=" + itemList + "]";
	}

	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	
	
}
