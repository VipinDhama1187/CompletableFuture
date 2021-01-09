package com.vipin;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.vipin.model.Order;

public class OrderCallableTest {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		try {
			Order order = null;
			OrderCallableTask orderTask;
			orderTask = new OrderTask();

			order = extracteAndFetchResult(executorService, order, orderTask);
			orderTask = new EnrichOrder(order);
			order = extracteAndFetchResult(executorService, order, orderTask);
			orderTask = new PerformOrderPayment(order);
			order = extracteAndFetchResult(executorService, order, orderTask);

			orderTask = new DispatchOrder(order);
			order = extracteAndFetchResult(executorService, order, orderTask);

			orderTask = new SendEmail(order);
			order = extracteAndFetchResult(executorService, order, orderTask);
			executorService.shutdown();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

	private static Order extracteAndFetchResult(ExecutorService executorService, Order order,
			OrderCallableTask orderTask) throws InterruptedException, ExecutionException {
		Future<Order> orderTaskFuture = executeCallable(executorService, orderTask);
		if (null == orderTaskFuture || null == orderTaskFuture.get())
			Thread.sleep(5000);
		else {
			order = orderTaskFuture.get();
			System.out.println(order);
		}
		return order;
	}

	private static Future<Order> executeCallable(ExecutorService executorService, Callable<Order> callable) {
		return executorService.submit(callable);

	}

}
