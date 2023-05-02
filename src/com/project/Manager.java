package com.project;

public class Manager extends User {

	Restaurant restaurant;

	public Manager(String name, String surName, String username, String email, String password, String phone) {
		super(name, surName, username, email, password, phone);
		setUserRole(EUserRole.MANAGER);

	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public String toString() {
		return "Manager [restaurant=" + restaurant + ", getUserRole()=" + getUserRole() + ", getName()=" + getName()
				+ ", getSurName()=" + getSurName() + ", getUsername()=" + getUsername() + ", getEmail()=" + getEmail()
				+ ", getPassword()=" + getPassword() + ", getPhone()=" + getPhone() + "]";
	}

}
