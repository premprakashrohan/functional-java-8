package com.ki.samples;

import java.util.Scanner;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = s.nextInt();
		if (isPrime(n)) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}

	}

	public static void main1(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int start = s.nextInt();
		System.out.print("Enter the second number : ");
		int end = s.nextInt();
		System.out.println("List of prime numbers between " + start + " and " + end);
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	static boolean isPrimeNumber(int n) {
		int i, m = 0, flag = 0;
		// it is the number to be checked
		m = n / 2;
		// System.out.println(m);
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		} // end of else
		return flag == 0;
	}
}
