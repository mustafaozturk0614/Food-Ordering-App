package com.project;

import java.time.LocalDateTime;
import java.util.Map;

public class Order {

	private Customer customer;
	private Restaurant restaurant;
	private LocalDateTime orderDate;
	private EOrderStatus status;
	private Map<Product, Integer> items;// cola 3
	private double totalPrice;

	public Order() {
		this.orderDate = LocalDateTime.now();
		this.status = EOrderStatus.RECEIVED;
	}

	public Order(Customer customer, Restaurant restaurant, Map<Product, Integer> items, double totalPrice) {
		this();
		this.customer = customer;
		this.restaurant = restaurant;
		this.items = items;
		this.totalPrice = totalPrice;

	}

	public Customer getCustomer() {
		return customer;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public EOrderStatus getStatus() {
		return status;
	}

	public Map<Product, Integer> getItems() {
		return items;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public void setStatus(EOrderStatus status) {
		this.status = status;
	}

	public void setItems(Map<Product, Integer> items) {
		this.items = items;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", restaurant=" + restaurant + ", orderDate=" + orderDate + ", status="
				+ status + ", items=" + items + ", totalPrice=" + totalPrice + "]";
	}

}
