package com.microservices.aggregator.model;

import java.util.Date;

public class Order {

	private String orderId;

	private Integer orderAmount;
	
	private Date date;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Integer getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Integer orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Date getdate() {
		return date;
	}

	public void setOrderDate(Date date) {
		this.date = date;
	}

}
