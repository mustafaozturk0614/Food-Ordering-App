package com.project;

import java.util.Scanner;

public abstract class User implements IProfile<User> {

	private String name;
	private String surName;
	private String username;
	private String email;
	private String password;
	private String phone;
	private EUserRole userRole;

	public User() {

	}

	public User(String name, String surName, String username, String email, String password, String phone) {
		super();
		this.name = name;
		this.surName = surName;
		this.username = username;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}

	public EUserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(EUserRole userRole) {
		this.userRole = userRole;
	}

	public String getName() {
		return name;
	}

	public String getSurName() {
		return surName;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getPhone() {
		return phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", surName=" + surName + ", username=" + username + ", email=" + email
				+ ", password=" + password + ", phone=" + phone + ", userRole=" + userRole + "]";
	}

	@Override
	public void updateProfile(User t) {

	}

	@Override
	public User registerInformation() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen kullanıcı isminizi giriniz");
		this.username = scanner.nextLine();
		System.out.println("Lütfen isminizi giriniz");
		this.name = scanner.nextLine();
		System.out.println("Lütfen soy isiminizi giriniz");
		this.surName = scanner.nextLine();
		System.out.println("Lütfen email adresinizi giriniz");
		this.email = scanner.nextLine();
		System.out.println("Lütfen telefon numaranızı giriniz");
		this.phone = scanner.nextLine();
		System.out.println("Lütfen şifrenizi giriniz giriniz");
		this.password = scanner.nextLine();

		return this;
	}

}
