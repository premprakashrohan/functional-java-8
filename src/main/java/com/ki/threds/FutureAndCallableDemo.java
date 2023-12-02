package com.ki.threds;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureAndCallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newWorkStealingPool(10);

		Callable<String> callable = () -> {
			// Perform some computation
			//System.out.println("Entered Callable");
			Thread.sleep(2000);
			return "Hello from Callable";
		};
		System.out.println("Submitting Callable");
		Future<String> future = executorService.submit(callable);
		// This line executes immediately
		System.out.println("Do something else while callable is getting executed");

		System.out.println("Retrieve the result of the future");
		// Future.get() blocks until the result is available
		String result = future.get();
		//System.out.println(result);

		List<Future<String>> futures = new ArrayList<Future<String>>();
		for (int i = 0; i <= 10; i++) {
			futures.add(executorService.submit(callable));
		}
		//System.out.println(futures);
		executorService.shutdown();

		executorService = Executors.newSingleThreadExecutor();

		future = executorService.submit(() -> {
			Thread.sleep(2000);
			return "Hello from Callable";
		});

		while (!future.isDone()) {
			System.out.println("Task is still not done...");
			Thread.sleep(200);
		}

		System.out.println("Task completed! Retrieving the result");
		result = future.get();
		System.out.println(result);

		executorService.shutdown();
	}
}
