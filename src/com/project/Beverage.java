package com.project;

public class Beverage extends Product {

	private int litre;

	public Beverage(String name, double price, String description, int litre) {
		super(name, price, description);
		this.litre = litre;
		setProductType(EProductType.BEVERAGE);
	}

	public int getLitre() {
		return litre;
	}

	public void setLitre(int litre) {
		this.litre = litre;
	}

	@Override
	public String toString() {
		return "Beverage [litre=" + litre + ", getName()=" + getName() + ", getPrice()=" + getPrice()
				+ ", getDescription()=" + getDescription() + ", getProductType()=" + getProductType() + "]";
	}

}
