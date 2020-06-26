package com.microservices.orders.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.orders.model.Order;
import com.microservices.orders.repository.OrderRepository;


@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	public OrderRepository orderRepository;
	
	 @GetMapping("/{userId}")
	    private List<Order> getOrderaByUserId( @PathVariable ("userId") String userId) {	
		 	List<Order> orders = orderRepository.getOrderByUserid(userId);
			if (null != orders) {
				//log
			} else {
				orders = new ArrayList<>();
				//log
			}
		    return orders;
	 }

}
