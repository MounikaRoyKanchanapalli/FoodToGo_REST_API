package com.first.foodApp.service;

import java.util.List;

import com.first.foodApp.model.OrderDetails;

public interface OrderService {

	public String createOrder(OrderDetails order);
	public String updateOrder(OrderDetails order);
	 List<OrderDetails> viewAllOrders();
	
}
