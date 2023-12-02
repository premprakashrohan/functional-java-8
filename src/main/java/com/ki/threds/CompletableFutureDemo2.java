package com.ki.threds;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureDemo2 {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService es = Executors.newCachedThreadPool();
		ExecutorService ioBound = Executors.newFixedThreadPool(2);
		for (int i = 0; i <= 10; i++) {
			CompletableFuture.supplyAsync(() -> getOrder(0), es).thenApplyAsync(o -> enrichOrder(o))
					.thenApplyAsync(o -> performPayment(o)).thenApplyAsync(o -> dispatch(o), ioBound)
					.thenApplyAsync(o -> sendEmail(o), Executors.newFixedThreadPool(1));
		}
		es.shutdown();
		ioBound.shutdown();
	}

	static Order getOrder(int i) {
		return new Order(Math.random());
	}

	static Order enrichOrder(Order o) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Enriching the order :" + o);
		return o;
	}

	static Order performPayment(Order o) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Payment done for :" + o);
		return o;
	}

	static Order dispatch(Order o) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Dispatched :" + o);
		return o;
	}

	static boolean sendEmail(Order o) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Email sent for :" + o);
		return true;
	}

}

class Order {
	double price;

	@Override
	public String toString() {
		return "Order [price=" + price + "]";
	}

	public Order(double price) {
		System.out.println("order created :" + price);
		this.price = price;
	}
}