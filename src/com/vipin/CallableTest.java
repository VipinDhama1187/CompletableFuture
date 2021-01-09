package com.vipin;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

/**
 * The Class CallableTest.
 */
public class CallableTest {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		// Submit the task and accept the placeholder object for return value
		Future<Integer> future = executorService.submit(() -> {
			//System.out.println("Executing Thread " + Thread.currentThread().getName());
			// Thread.sleep(5000);
			IntStream.range(0, 1000000).forEach(index -> System.out.println(index));
			return new Random().nextInt();
		});
		try {
			System.out.println(future);
			// get the task return vale
			System.out.println(future.get());// blocking operation
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

	}

}
