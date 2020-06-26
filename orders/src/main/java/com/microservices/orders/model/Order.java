package com.microservices.orders.model;

import java.util.Date;

public class Order {

	private String orderId;

	private Integer orderAmount;

	private Date date;

	public Order() {

	}

	public Order(String orderId, Integer orderAmount, Date date) {
		this.orderId = orderId;		
		this.orderAmount = orderAmount;
		this.date = date;
	}

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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
