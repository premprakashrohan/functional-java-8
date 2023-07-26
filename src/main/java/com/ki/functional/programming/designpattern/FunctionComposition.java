package com.ki.functional.programming.designpattern;

import java.util.function.Function;

public class FunctionComposition {

	// Function to add 10 to an integer
	public static Function<Integer, Integer> add10 = num -> num + 10;

	// Function to square an integer
	public static Function<Integer, Integer> square = num -> num * num;

	public static void main(String[] args) {
		// Function composition: square(add10(x))
		Function<Integer, Integer> add10AndSquare = add10.andThen(square);

		int input = 5;
		int result = add10AndSquare.apply(input);

		System.out.println("Input: " + input);
		System.out.println("Result: " + result);
	}

}
/**
 * Function composition is a powerful technique in functional programming where
 * two or more functions are combined to create a new function that applies one
 * function after the other. In Java, you can achieve function composition using
 * lambda expressions or method references. Here's a Java code example to
 * demonstrate function composition:
 * 
 * In this example, we have two functions add10 and square, each represented by
 * a Function instance from the java.util.function package. The add10 function
 * adds 10 to the input integer, and the square function calculates the square
 * of the input integer.
 * 
 * We then create a new function add10AndSquare by composing add10 and square
 * together using the andThen method. The andThen method takes one function as
 * input and returns a new function that applies the first function and then the
 * second function.
 * 
 * In the main method, we demonstrate function composition by applying
 * add10AndSquare to an input value of 5. The result is calculated as follows:
 * 
 * Result = square(add10(5)) = square(5 + 10) = square(15) = 225 
 * So, the output will be: Input: 5 Result: 225 As you can see, function composition
 * allows us to create complex transformations by chaining simple functions
 * together, making the code more concise and expressive.
 */