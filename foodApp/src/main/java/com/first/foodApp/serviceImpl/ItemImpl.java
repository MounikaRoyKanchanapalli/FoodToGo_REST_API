package com.first.foodApp.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.first.foodApp.model.Item;
import com.first.foodApp.repository.ItemRepo;
import com.first.foodApp.service.ItemService;

@Service
public class ItemImpl implements ItemService{

	ItemRepo itemRepo;
	
	
	public ItemImpl(ItemRepo itemRepo) {
		super();
		this.itemRepo = itemRepo;
	}

	@Override
	public String createItem(Item item) {
		// TODO Auto-generated method stub
		itemRepo.save(item);
		return "Created Item";
	}

	@Override
	public String updateItem(Item item) {
		// TODO Auto-generated method stub
		itemRepo.save(item);
		return "Updated Item";
	}

	@Override
	public String deleteItem(Long itemId) {
		// TODO Auto-generated method stub
		itemRepo.deleteById(itemId);
		return "Item Deleted";
	}

	@Override
	public Item getItemById(Long itemId) {
		// TODO Auto-generated method stub
		return itemRepo.findById(itemId).get();
	}

	@Override
	public List<Item> getAllItems() {
		// TODO Auto-generated method stub
		return itemRepo.findAll();
	}

}
