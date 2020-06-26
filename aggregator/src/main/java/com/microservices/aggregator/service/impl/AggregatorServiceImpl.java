package com.microservices.aggregator.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices.aggregator.model.Order;
import com.microservices.aggregator.model.OrderDetails;
import com.microservices.aggregator.model.Result;
import com.microservices.aggregator.model.User;
import com.microservices.aggregator.service.AggregatorService;

@Service
public class AggregatorServiceImpl implements AggregatorService{

	/*
	 * @Resource(name = "restTemp") private RestTemplate restTemplate;
	 */
	
	/*
	 * public static String atpUri;
	 * 
	 * @Value("${atp.uri}") public void setAtpUri(String uri) { atpUri = uri; }
	 */
	@Override
	public OrderDetails getOrderDetails(String userId) {
		//String uriForAtp = atpUri + "/" + ;
		//Class class= restTemplate.getForObject(uriForAtp, class);
		RestTemplate restTemplate = new RestTemplate();
		String userSource = System.getenv().getOrDefault("USER_URL", "http://localhost:8080");
		String orderSource = System.getenv().getOrDefault("ORDER_URL", "http://localhost:8081");
		userSource = userSource + "/user/" + userId;
		orderSource = orderSource + "/orders/" + userId;
		User user = restTemplate.getForObject(userSource, User.class);
		OrderDetails result = new OrderDetails();
		System.out.println(user.getEmail());
		if (null != user) {	
			System.out.println("Now getting orders");
			//Result orders = restTemplate.getForObject(orderSource, Result.class);
			ResponseEntity<Order[]> response =restTemplate.getForEntity(orderSource, Order[].class);
			Order[] ord = response.getBody();
			System.out.println("Setting User");
			result.setUserDetails(user);
			System.out.println("Setting Orders");
			List<Order> orders=new ArrayList<Order>();
			if (null != ord) {
				for (Order o : ord) { 
		            orders.add(o); 
		        }	
				result.setOrders(orders);
			}
		}
		return result;
	}

}
