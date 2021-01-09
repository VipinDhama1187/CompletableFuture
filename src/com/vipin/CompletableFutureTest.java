package com.vipin;

import java.util.concurrent.CompletableFuture;
import java.util.stream.LongStream;

public class CompletableFutureTest {

	public static void main(String[] args) {
		LongStream.range(0, 100).forEach(index -> {
			/*
			 * CompletableFuture.supplyAsync(() -> CompletableFutureTask.getOrder(index))
			 * .thenApply(enrichOrder -> CompletableFutureTask.enrichOrder(enrichOrder))
			 * .thenApply(payOrder -> CompletableFutureTask.payOrder(payOrder))
			 * .thenApply(dispatchOrder ->
			 * CompletableFutureTask.dispatchOrder(dispatchOrder)) .thenAccept(sendEmail ->
			 * CompletableFutureTask.sendEmail(sendEmail));
			 */
			CompletableFuture.supplyAsync(() -> CompletableFutureTask.getOrder(index))
					.thenApply(CompletableFutureTask::enrichOrder)
					.thenApply(CompletableFutureTask::payOrder)
					.thenApply(CompletableFutureTask::dispatchOrder)
					.thenAccept(CompletableFutureTask::sendEmail);
		});

	}

}
