package com.ki.functional.programming.designpattern;

import java.util.function.Function;

public class Currying {
	// Custom functional interface for a curried binary function (2 arguments)
	interface CurriedBinaryFunction<T, U, R> extends Function<T, Function<U, R>> {
	}

	public static void main(String[] args) {
		// Original binary function (2 arguments)
		CurriedBinaryFunction<Integer, Integer, Integer> add = a -> b -> a + b;

		// Currying allows us to chain functions
		Function<Integer, Integer> add5 = add.apply(5);

		int result = add5.apply(10);
		System.out.println("Result: " + result); // Output: Result: 15
	}
}
/*
 * 
 * 
 * 
 * Currying is a technique where a function that takes multiple arguments is
 * transformed into a series of functions, each taking a single argument. Again,
 * we can simulate currying using custom functional interfaces.
 * 
 * In this example, we have created a custom functional interface
 * CurriedBinaryFunction to represent a curried binary function with two
 * arguments. We then create the add function using this custom interface. By
 * applying partial application with add.apply(5), we get a new function add5,
 * which represents adding 5 to its argument. When we call add5.apply(10), it is
 * equivalent to calling add.apply(5).apply(10), resulting in the value 15.
 * 
 * Keep in mind that while Java doesn't have built-in support for currying and
 * partial application like functional programming languages, these custom
 * functional interfaces can help you achieve similar behavior and take
 * advantage of functional programming techniques in Java.
 */