package com.ki.functionalInterface.Bi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTester {
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,null,null,null,null);
		Predicate<Integer> greaterThen = (l) -> l > 10;
		Predicate<Integer> isEvenNumber = n -> n % 2 == 0;
		System.out.println(greaterThen.and(isEvenNumber).test(12));
		System.out.println(greaterThen.or(isEvenNumber).test(8));
		Predicate.isEqual("Hello");
		// Predicate<Integer> predicate = n -> true
		// n is passed as parameter to test method of Predicate interface
		// test method will always return true no matter what value n has.

		System.out.println("Print all numbers:");

		// pass n as parameter
		//eval(list, (n -> true));
		list.stream().forEach(System.out::println);

		// Predicate<Integer> predicate1 = n -> n%2 == 0
		// n is passed as parameter to test method of Predicate interface
		// test method will return true if n%2 comes to be zero

		System.out.println("Print even numbers:");
		//eval(list, n -> n % 2 == 0);
		list.stream().filter(n -> n !=null).filter(n -> n % 2 == 0).forEach(System.out::println);
		// Predicate<Integer> predicate2 = n -> n > 3
		// n is passed as parameter to test method of Predicate interface
		// test method will return true if n is greater than 3.

		System.out.println("Print numbers greater than 3:");
		//eval(list, n -> n > 3);
		list.stream().filter(n -> n !=null).filter(n -> n > 3).forEach(System.out::println);
		System.out.println("Print numbers isEqual 7:");
		
		list.stream().filter(Predicate.isEqual(7)).forEach(System.out::println);
		list.stream().filter(n -> n !=null).filter(i -> i > 10).filter(n -> n % 2 == 0).forEach(System.out::println);
	}

	public static void eval(List<Integer> list, Predicate<Integer> predicate) {

		for (Integer n : list) {

			if (predicate.test(n)) {
				System.out.println(n + " ");
			}
		}
	}
}