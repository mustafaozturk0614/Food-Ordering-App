package com.project;

import java.util.Scanner;

public class ProductFactory {

	public static Product createProduct(String roleIndex, String name, String description, double price,
			Scanner scanner) {

		if (roleIndex.equalsIgnoreCase("1")) {
			System.out.println("Lütfen urun miktarını giriniz");
			int litre = Integer.parseInt(scanner.nextLine());
			return new Beverage(name, price, description, litre);
		} else {
			return new Food(name, price, description);
		}
	}

}
