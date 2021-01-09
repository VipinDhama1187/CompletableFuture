package com.vipin;

import com.vipin.model.Order;

public class EnrichOrder extends OrderCallableTask {

	public EnrichOrder(Order order) {
		super(order);
	}

	@Override
	public Order call() throws Exception {
		System.out.println("Enriching order");
		this.getOrder().setEnrichOrder(Boolean.TRUE);
		return this.getOrder();
	}

}
