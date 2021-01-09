package com.vipin;

import java.util.concurrent.Callable;

import com.vipin.model.Order;

public abstract class OrderCallableTask implements Callable<Order> {
	private Order order;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public OrderCallableTask(Order order) {
		this.order = order;
	}

	public OrderCallableTask() {
	}

}
