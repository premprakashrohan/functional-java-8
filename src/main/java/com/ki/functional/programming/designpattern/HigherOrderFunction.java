package com.ki.functional.programming.designpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class HigherOrderFunction {
	// Higher-order function that takes a list of integers and a function,
	// and applies the function to each element of the list, returning a new list
	// with the results.
	public static List<Integer> map(List<Integer> inputList, Function<Integer, Integer> mapper) {
		List<Integer> resultList = new ArrayList<>();

		for (Integer num : inputList) {
			int mappedValue = mapper.apply(num);
			resultList.add(mappedValue);
		}

		return resultList;
	}

	public static void main(String[] args) {
		List<Integer> inputList = List.of(1, 2, 3, 4, 5);

		// Define a lambda function to double each element in the list
		Function<Integer, Integer> doubleMapper = num -> num * 2;

		// Use the map higher-order function with the doubleMapper function
		List<Integer> doubledList = map(inputList, doubleMapper);

		System.out.println("Input List: " + inputList);
		System.out.println("Doubled List: " + doubledList);

		// Define a lambda function to calculate the square of each element in the list
		Function<Integer, Integer> squareMapper = num -> num * num;

		// Use the map higher-order function with the squareMapper function
		List<Integer> squaredList = map(inputList, squareMapper);

		System.out.println("Input List: " + inputList);
		System.out.println("Squared List: " + squaredList);
	}
}

/**
 * In this example, we have a higher-order function map that takes a list of
 * integers inputList and a function mapper as arguments. The mapper function is
 * applied to each element of the inputList, and the results are collected into
 * a new list, which is returned as the result.
 * 
 * In the main method, we demonstrate the use of the map higher-order function
 * with two different mapper functions: doubleMapper and squareMapper. The
 * doubleMapper function doubles each element in the list, and the squareMapper
 * function calculates the square of each element.
 * 
 * When you run the main method, it will print:
 * 
 * Input List: [1, 2, 3, 4, 5] 
 * Doubled List: [2, 4, 6, 8, 10]
 * Input List: [1, 2, 3, 4, 5] 
 * Squared List: [1, 4, 9, 16, 25] 
 * As you can see,
 * the map higher-order function abstracts the common behavior of iterating
 * through a list and applying a specific operation, allowing us to reuse it
 * with different mapper functions to achieve different transformations on the
 * input data.
 */
