package com.project;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cart {

	private Map<Product, Integer> items;
	private double totalPrice;

	public Cart() {
		this.items = new LinkedHashMap<>();
	}

	public Map<Product, Integer> getItems() {
		return items;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setItems(Map<Product, Integer> items) {
		this.items = items;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Cart [items=" + items + ", totalPrice=" + totalPrice + "]";
	}

}
