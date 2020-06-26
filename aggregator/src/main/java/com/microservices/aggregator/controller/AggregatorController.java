package com.microservices.aggregator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.aggregator.model.OrderDetails;
import com.microservices.aggregator.service.AggregatorService;

@RestController
@RequestMapping("/orderdetails")
public class AggregatorController {

	@Autowired
	public AggregatorService aggregatorService;
	
	@GetMapping(value = "/{userId}")
	public OrderDetails getOrderDetails(@PathVariable ("userId") String userId) {
		return aggregatorService.getOrderDetails(userId);
	}

}
