package com.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Restaurant implements IProfile<Restaurant> {

	private String name;
	private String address;
	private List<Product> menu;
	private Manager manager;

	public Restaurant() {
		this.menu = new ArrayList<>();
	}

	public Restaurant(String name, String address, Manager manager) {
		super();
		this.name = name;
		this.address = address;
		this.manager = manager;
	}

	@Override
	public void updateProfile(Restaurant t) {
		// TODO Auto-generated method stub

	}

	@Override
	public Restaurant registerInformation() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir isim giriniz");
		this.name = scanner.nextLine();
		System.out.println("Lütfen bir adres giriniz giriniz");
		this.address = scanner.nextLine();
		createMenu();
		return this;
	}

	public List<Product> createMenu() {
		if (menu == null) {
			menu = new ArrayList<>();
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Menu olusturma ekranı");
		String kontrol = "h";

		do {
			System.out.println("Lütfen bir urun ismi giriniz");
			String name = scanner.nextLine();
			System.out.println("Lütfen bir urun acıklaması giriniz");
			String description = scanner.nextLine();
			System.out.println("Lütfen bir urun fiyati giriniz");
			double price = Double.parseDouble(scanner.nextLine());
			Arrays.asList(EProductType.values()).forEach(x -> System.out.println((x.ordinal() + 1) + "-" + x.name()));
			System.out.println("Lütfen bir urun turu seciniz");
			String secim = scanner.nextLine();
			Product product = ProductFactory.createProduct(secim, name, description, price, scanner);
			menu.add(product);
			System.out.println("Yeni bir urun eklmek istermisiniz (E/H)");
			kontrol = scanner.nextLine();

		} while (!kontrol.equalsIgnoreCase("h"));

		return menu;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public List<Product> getMenu() {
		return menu;
	}

	public Manager getManager() {
		return manager;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setMenu(List<Product> menu) {
		this.menu = menu;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

}
