package com.project;

public class UserFactory {

	public static User createUser(String roleIndex) {
		if (roleIndex.equalsIgnoreCase("1")) {
			return new Customer();
		} else {
			return new Manager();
		}
	}

}
