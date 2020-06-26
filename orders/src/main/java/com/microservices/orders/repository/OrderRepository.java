package com.microservices.orders.repository;

import java.util.List;

import com.microservices.orders.model.Order;

public interface OrderRepository {

	public List<Order> getOrderByUserid(String userId);
	
}
