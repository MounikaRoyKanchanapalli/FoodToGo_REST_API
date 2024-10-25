package com.first.foodApp.service;

import java.util.List;

import com.first.foodApp.model.Item;

public interface ItemService {
	
	public String createItem(Item item);
	public String updateItem(Item item);
	public String deleteItem(Long itemId);
	public Item getItemById(Long itemId);
	public List<Item> getAllItems();
}
