package com.ki.functionalInterface.Bi;

public class UserNamePasswordPredicate {

	public static void main(String[] args) {
	 

	}

}

final class User {
	final String username;
	final String password;

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}