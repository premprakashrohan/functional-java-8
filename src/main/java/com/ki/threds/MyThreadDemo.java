package com.ki.threds;

public class MyThreadDemo {

	public static void main(String[] args) {
		new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				System.out.println("Child Thread");
			}
		}).run();
		for (int i = 0; i < 100; i++) {
			System.out.println("parent Thread");
		}
	}

}
