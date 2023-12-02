package com.ki.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		// Function which takes in a number and
		// returns half of it
		Function<Integer, Double> half = a -> a / 2.0;

		// apply the function to get the result
		System.out.println(half.apply(10));
		Function<Integer, Double> cube = a -> 3.0 * a;

		System.out.println(half.apply(10));

		System.out.println(cube.apply(10));
	//	System.out.println(half.andThen(cube).apply(10));

		// Now treble the output of half function
		half = half.andThen(a -> 3 * a);

		// apply the function to get the result
		System.out.println(half.apply(10));

		try {

			// try to pass null as parameter
			half = half.andThen(null);
		} catch (Exception e) {
			System.out.println("Exception thrown " + "while passing null: " + e);
		}

		// However treble the value given to half function
		half = half.compose(a -> 3 * a);
		// 10/2= 5 ->15

		// apply the function to get the result
		System.out.println(half.apply(10));

		List<String> list = Arrays.asList("Test", "Test1", "Test2", "Test3", null);

		Function<String, Integer> lengthFunction = s -> s.length();
		System.out.println(lengthFunction.apply("Test"));
		// list.stream().filter(s->s!=null).flatMap(lengthFunction);

		// Function which takes in a number and
		// returns it
		Function i = Function.identity();

		System.out.println(i);

	}

}
