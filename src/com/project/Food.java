package com.project;

public class Food extends Product {

	public Food(String name, double price, String description) {
		super(name, price, description);
		setProductType(EProductType.FOOD);
	}

}
