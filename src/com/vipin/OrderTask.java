package com.vipin;

import com.vipin.model.Order;

public class OrderTask extends OrderCallableTask {

	public OrderTask() {
		super();
	}

	@Override
	public Order call() throws Exception {
		System.out.println("Getting order");
		return new Order(1l);
	}

}
