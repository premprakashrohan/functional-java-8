package com.ki.functional.programming.designpattern;

import java.util.function.Function;

public class PartialApplication {
	// Custom functional interface for a binary function (2 arguments)
	interface BinaryFunction<T, U, R> {
		R apply(T t, U u);
	}

	public static void main(String[] args) {
		// Original binary function (2 arguments)
		BinaryFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

		// Partial application by fixing the first argument (creating a new function)
		Function<Integer, Integer> add5 = a -> add.apply(a, 5);

		int result = add5.apply(10);
		System.out.println("Result: " + result); // Output: Result: 15
	}
}
/**
 * 
 * 
 * Partial application involves fixing a certain number of arguments to a
 * function, creating a new function with fewer arguments. We can achieve this
 * by creating a custom functional interface for each arity (number of
 * arguments) of functions.
 * 
 * 
 * In this example, we have created a custom functional interface BinaryFunction
 * to represent a binary function with two arguments. We then create the add
 * function using this custom interface. We can perform partial application by
 * fixing the first argument to add, creating a new function add5, which
 * represents adding 5 to its argument. When we call add5.apply(10), it is
 * equivalent to calling add.apply(10, 5), resulting in the value 15.
 */