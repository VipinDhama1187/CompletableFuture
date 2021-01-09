package com.vipin;

import com.vipin.model.Order;

public class CompletableFutureTask {

	public static Order getOrder(long index) {
		System.out.println("Getting Order_" + index);
		return new Order(index);
	}

	public static Order enrichOrder(Order order) {
		System.out.println("Enrich Order_" + order.getId());
		order.setEnrichOrder(Boolean.TRUE);
		return order;
	}
	
	public static Order payOrder(Order order) {
		System.out.println("pay for Order_" + order.getId());
		order.setOrderPayment(Boolean.TRUE);
		return order;
	}
	
	public static Order dispatchOrder(Order order) {
		System.out.println("dispatch Order_" + order.getId());
		order.setDispatchOrder(Boolean.TRUE);
		return order;
	}
	
	public static Order sendEmail(Order order) {
		System.out.println("sendEmail fro Order_" + order.getId());
		order.setSendEmail(Boolean.TRUE);
		return order;
	}

}
