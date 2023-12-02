package com.ki.parallel;

public final class Trade {
	private String name;
	private int quantity;
	private double price;
	private TradeStatus status;

	public Trade(String name, int quantity, double price, TradeStatus status) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public TradeStatus getStatus() {
		return status;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "Trade [quantity=" + quantity + ", price=" + price + "]";
	}
}
