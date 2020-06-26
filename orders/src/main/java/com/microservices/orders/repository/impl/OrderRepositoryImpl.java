package com.microservices.orders.repository.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.microservices.orders.model.Order;
import com.microservices.orders.repository.OrderRepository;

@Component
public class OrderRepositoryImpl implements OrderRepository {

	static Map<String, List<Order>> orders = new HashMap<String, List<Order>>();

	static {
		List<Order> order1 = new ArrayList<>();
		order1.add(new Order("1", 10, Calendar.getInstance().getTime()));
		order1.add(new Order("2", 20, Calendar.getInstance().getTime()));
		orders.put("1", order1);
		List<Order> order2 = new ArrayList<>();
		order2.add(new Order("3", 20, Calendar.getInstance().getTime()));
		order2.add(new Order("4", 30, Calendar.getInstance().getTime()));
		orders.put("2", order2);
		List<Order> order3 = new ArrayList<>();
		order3.add(new Order("5", 20, Calendar.getInstance().getTime()));
		order3.add(new Order("6", 30, Calendar.getInstance().getTime()));
		orders.put("3", order3);
	}

	public List<Order> getOrderByUserid(String userId) {
		List<Order> result = null;
		if (orders.containsKey(userId)) {
			result = orders.get(userId);
		}
		return result;
	}

}
