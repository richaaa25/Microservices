package com.microservices.aggregator.model;

import java.util.List;

public class Result {

	List<Order> orders;

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
