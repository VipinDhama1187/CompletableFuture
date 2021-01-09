package com.vipin;

import com.vipin.model.Order;

public class DispatchOrder extends OrderCallableTask {

	public DispatchOrder(Order order) {
		super(order);
	}

	@Override
	public Order call() throws Exception {
		System.out.println("Dispatching order");
		this.getOrder().setDispatchOrder(Boolean.TRUE);
		return this.getOrder();
	}

}
