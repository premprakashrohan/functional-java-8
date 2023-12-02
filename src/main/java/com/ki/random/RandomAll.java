package com.ki.random;

import java.util.Random;

public class RandomAll {
	static public Random ran = new Random();

	public static String getString(int size) {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder salt = new StringBuilder();
		while (salt.length() < size) { // length of the random string.
			int index = (int) (ran.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;
	}

	public static Integer getInt(int min, int max) {
		return (int) ran.nextInt(max);
	}

	public static Double getDouble(int min, int max) {
		return ran.nextDouble() * max;
	}

	public static Boolean getBoolean() {
		return ran.nextBoolean();
	}

	public static void main(String[] args) {
		System.out.println(getString(10));
		System.out.println(getInt(1, 100));
		System.out.println(getDouble(1, 100));
	}
}
