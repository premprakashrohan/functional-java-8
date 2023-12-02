package com.ki.samples;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberDemo {

	public static void main(String[] args) {
		int min = 200;
		int max = 400;
		// Generate random double value from 200 to 400
		System.out.println("Random value of type double between " + min + " to " + max + ":");
		double a = Math.random() * (max - min + 1) + min;
		System.out.println(a);
		// Generate random int value from 200 to 400
		System.out.println("Random value of type int between " + min + " to " + max + ":");
		int b1 = (int) (Math.random() * (max - min + 1) + min);
		System.out.println(b1);

		// creating an object of Random class
		Random random = new Random();
		// Generates random integers 0 to 49
		int x = random.nextInt(50);
		// Generates random integers 0 to 999
		int y = random.nextInt(1000);
		// Prints random integer values
		System.out.println("Randomly Generated Integers Values");
		System.out.println(x);
		System.out.println(y);
		// Generates Random doubles values
		a = random.nextDouble();
		double b = random.nextDouble();
		// Prints random double values
		System.out.println("Randomly Generated Double Values");
		System.out.println(a);
		System.out.println(b);
		// Generates Random float values
		float f = random.nextFloat();
		float i = random.nextFloat();
		// Prints random float values
		System.out.println("Randomly Generated Float Values");
		System.out.println(f);
		System.out.println(i);
		// Generates Random Long values
		long p = random.nextLong();
		long q = random.nextLong();
		// Prints random long values
		System.out.println("Randomly Generated Long Values");
		System.out.println(p);
		System.out.println(q);
		// Generates Random boolean values
		boolean m = random.nextBoolean();
		boolean n = random.nextBoolean();
		// Prints random boolean values
		System.out.println("Randomly Generated Boolean Values");
		System.out.println(m);
		System.out.println(n);
		// Generate random integers between 0 to 999
		int x1 = ThreadLocalRandom.current().nextInt();
		int y1 = ThreadLocalRandom.current().nextInt();
		// Print random integer values
		System.out.println("Randomly Generated Integer Values:");
		System.out.println(x1);
		System.out.println(y1);
		// Generate Random double values
		double c = ThreadLocalRandom.current().nextDouble();
		double d = ThreadLocalRandom.current().nextDouble();
		// Print random doubles
		System.out.println("Randomly Generated Double Values:");
		System.out.println(c);
		System.out.println(d);
		// Generate random boolean values
		boolean e = ThreadLocalRandom.current().nextBoolean();
		boolean f1 = ThreadLocalRandom.current().nextBoolean();
		// Print random Booleans
		System.out.println("Randomly Generated Boolean Values:");
		System.out.println(e);
		System.out.println(f1);

		randomInts(5);
		randomInts(9, 50, 90);
	}

	// method that generates a stream of integers having size 5
	public static void randomInts(int num) {
		Random random = new Random();
		random.ints(num).forEach(System.out::println);
	}

	// method that generates a stream of 9 integers between 50 to 90
	public static void randomInts(int num, int origin, int bound) {
		Random random1 = new Random();
		random1.ints(num, origin, bound).forEach(System.out::println);
	}
}
