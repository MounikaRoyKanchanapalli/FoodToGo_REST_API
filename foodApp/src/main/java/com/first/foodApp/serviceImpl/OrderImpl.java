package com.first.foodApp.serviceImpl;

import java.util.List;

import com.first.foodApp.model.OrderDetails;
import com.first.foodApp.repository.OrderRepo;
import com.first.foodApp.service.OrderService;

public class OrderImpl implements OrderService{

	OrderRepo orderRepo;
	
	@Override
	public String createOrder(OrderDetails order) {
		// TODO Auto-generated method stub
		orderRepo.save(order);
		return "Created Order";
	}

	public OrderImpl(OrderRepo orderRepo) {
		super();
		this.orderRepo = orderRepo;
	}

	@Override
	public String updateOrder(OrderDetails order) {
		// TODO Auto-generated method stub
		orderRepo.save(order);
		return "Update Order";
	}

	@Override
	public List<OrderDetails> viewAllOrders() {
		// TODO Auto-generated method stub
		return orderRepo.findAll();
	}

}
