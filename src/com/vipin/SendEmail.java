package com.vipin;

import com.vipin.model.Order;

public class SendEmail extends OrderCallableTask {

	public SendEmail(Order order) {
		super(order);
	}

	@Override
	public Order call() throws Exception {
		System.out.println("Send email for order");
		this.getOrder().setSendEmail(Boolean.TRUE);
		return this.getOrder();
	}

}
