package com.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class App implements IAuth {

	private List<User> users = new ArrayList<>(
			List.of(new Customer("Mustafa", "Ozturk", "musty", "mustafa@gmail.com", "123", "555"),
					new Customer("Tuba", "Ozturk", "tuba", "tuba@gmail.com", "123", "555"),
					new Customer("Hasan", "Gur", "haso", "hasan@gmail.com", "123", "555"),
					new Manager("Burhan", "Keskin", "burhan", "burhan@gmail.com", "123", "555")));
	private List<Restaurant> restaurants = new ArrayList<>();
	private User currentUser;
	Scanner scanner = new Scanner(System.in);

	public void mainMenu() {
		int kontrol = 0;

		do {
			System.out.println("===Ana Menu==");
			System.out.println("1-Kullanıcı Kaydı");
			System.out.println("2-Kullanıcı Girişi");
			System.out.println("0-Çıkış");
			System.out.println("Lütfen bir seçim yapınız");
			kontrol = Integer.parseInt(scanner.nextLine());
			switch (kontrol) {
			case 1:
				User user;
				Arrays.asList(EUserRole.values()).forEach(x -> System.out.println((x.ordinal() + 1) + "-" + x.name()));
				System.out.println("Lütfen bir role seçiniz");
				user = UserFactory.createUser(scanner.nextLine());
				register(user.registerInformation());
				users.forEach(System.out::println);
				break;
			case 2:
				login();
				break;
			case 0:
				System.out.println("Program sonlandırılıyor.....!");
				break;
			default:
				break;
			}

		} while (kontrol != 0);

	}

	public void managerMenu() {
		System.out.println("=== Yonetici Menusu==");
		System.out.println(currentUser.getUsername() + "---> Hoşgeldiniz");
		System.out.println("1-Restaurant olustur");
		System.out.println("2-Restaurant guncelle");
		System.out.println("3-Restaurant sil");
		System.out.println("4-Menuye urun ekle");
		System.out.println("5-Menuye guncelle");
		System.out.println("6-Menuden urun sil");
		System.out.println("7-Profil guncelle");
		System.out.println("8-Üst menuye don");

	}

	public void customerMenu() {
		System.out.println("===Musteri Menusu==");
		System.out.println(currentUser.getUsername() + "---> Hoşgeldiniz");
		System.out.println("1-Profil guncelle");
		System.out.println("2-Restaurantları goruntule");
		System.out.println("3-Sepete urun ekle");
		System.out.println("4-Sepeti goruntule");
		System.out.println("5-Sipariş ver");
		System.out.println("6-Sipariş durumu goruntule");
		System.out.println("7-Geçmiş Siparişlerim");
		System.out.println("8-Üst menuye don");

	}

	@Override
	public <T> T register(T t) {
		if (t instanceof User) {
			users.add((User) t);
		} else {
			restaurants.add((Restaurant) t);
		}

		return t;
	}

	@Override
	public void login() {
		System.out.println("Lütfen kullanıcı ismini giriniz");
		String username = scanner.nextLine();
		System.out.println("Lütfen şifrenizi giriniz");
		String password = scanner.nextLine();
		Optional<User> user = users.stream()
				.filter(x -> x.getUsername().equals(username) && x.getPassword().equals(password)).findFirst();

		if (user.isEmpty()) {
			System.out.println("Kullanıcı bilgileri hatalı girişi basarısız!!!!");
		} else {
			this.currentUser = user.get();
			System.out.println("Giriş başarılı....");
			menuChoose(user.get().getUserRole());

		}

	}

	public void menuChoose(EUserRole userRole) {

		if (userRole.equals(EUserRole.CUSTOMER)) {
			customerMenu();
		} else {
			managerMenu();
		}

	}

//	public static void main(String[] args) {
////		User user;
////		Scanner scanner = new Scanner(System.in);
////		Arrays.asList(EUserRole.values()).forEach(x -> System.out.println((x.ordinal() + 1) + "-" + x.name()));
////		System.out.println("Lütfen bir role seçiniz");
////		user = UserFactory.createUser(scanner.nextLine());
////		user.registerInformation();
////		System.out.println(user);
//
//		Restaurant restaurant = new Restaurant();
//		restaurant.registerInformation();
//
//		restaurant.getMenu().forEach(System.out::println);
//
//	}

}
