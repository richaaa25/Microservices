package com.microservices.aggregator.service;

import com.microservices.aggregator.model.OrderDetails;

public interface AggregatorService {

	OrderDetails getOrderDetails(String userId);

}
