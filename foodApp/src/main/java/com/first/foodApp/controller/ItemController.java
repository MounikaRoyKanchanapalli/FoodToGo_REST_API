package com.first.foodApp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.first.foodApp.model.Item;
import com.first.foodApp.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {

		ItemService itemService;

		public ItemController(ItemService itemService) {
			super();
			this.itemService = itemService;
		}
		
		@PostMapping
		public String createItem(@RequestBody Item item) {
			itemService.createItem(item);
			return "Created";
		}
		
		@GetMapping("{itemId}")
		public Item getItemById(@PathVariable("itemId") Long itemId) {
			return itemService.getItemById(itemId);			
		}
		
		@PutMapping
		public String updateItem(@RequestBody Item item) {
			itemService.updateItem(item);
			return "Updated";
		}
		
		@GetMapping
		public List<Item> getAllItems(){
			return itemService.getAllItems();			
		}
		
		@DeleteMapping("{itemId}")
		public String deleteItemById(@PathVariable("itemId") Long itemId) {
			itemService.deleteItem(itemId);
			return "deleted Item";
			
		}
}
