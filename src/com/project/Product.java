package com.project;

public abstract class Product {

	private String name;
	private double price;
	private String description;
	private EProductType productType;

	public Product(String name, double price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public EProductType getProductType() {
		return productType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setProductType(EProductType productType) {
		this.productType = productType;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", description=" + description + ", productType="
				+ productType + "]";
	}

}
