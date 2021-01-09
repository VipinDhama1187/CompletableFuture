package com.vipin;

import com.vipin.model.Order;

public class PerformOrderPayment extends OrderCallableTask {

	public PerformOrderPayment(Order order) {
		super(order);
	}

	@Override
	public Order call() throws Exception {
		System.out.println("order Payment");
		this.getOrder().setOrderPayment(Boolean.TRUE);
		return this.getOrder();
	}

}
