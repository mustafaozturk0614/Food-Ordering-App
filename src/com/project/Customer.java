package com.project;

import java.util.List;

public class Customer extends User {

	Cart cart;
	List<Order> orders;

	public Customer(String name, String surName, String username, String email, String password, String phone) {
		super(name, surName, username, email, password, phone);
		this.cart = new Cart();
		setUserRole(EUserRole.CUSTOMER);

	}

	public Cart getCart() {
		return cart;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer [cart=" + cart + ", orders=" + orders + ", getUserRole()=" + getUserRole() + ", getName()="
				+ getName() + ", getSurName()=" + getSurName() + ", getUsername()=" + getUsername() + ", getEmail()="
				+ getEmail() + ", getPassword()=" + getPassword() + ", getPhone()=" + getPhone() + "]";
	}

}
