package com.ki.samples;

public class PaharaDemo {

	public static void main(String[] args) {
		for (int j = 1; j <= 100; j++) {
			System.out.print("\n");
			for (int i = 1; i <= 100; i++) {
				System.out.print(i*j + "|     ");
			}
		}
	}

}
