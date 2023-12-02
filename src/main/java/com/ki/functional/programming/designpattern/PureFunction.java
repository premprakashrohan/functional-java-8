package com.ki.functional.programming.designpattern;

import java.util.ArrayList;
import java.util.List;

public class PureFunction {

	// This is a pure function that takes a list of integers and returns a new list
	// containing the squares of each element in the input list.
	public static List<Integer> squareList(List<Integer> inputList) {
		List<Integer> resultList = new ArrayList<>();

		for (Integer num : inputList) {
			resultList.add(num * num);
		}

		return resultList;
	}

	public static void main(String[] args) {
		List<Integer> inputList = List.of(1, 2, 3, 4, 5);

		// The squareList function does not modify the inputList and produces a new
		// result list.
		List<Integer> result = squareList(inputList);

		System.out.println("Input List: " + inputList);
		System.out.println("Result List: " + result);
	}

}
/**
 * In this example, squareList is a pure function. It takes a list of integers
 * as input and returns a new list with the squares of each element. The
 * function does not modify the input list or any external state. Given the same
 * input, it will always produce the same output, making it predictable and easy
 * to reason about. As you can see, the original inputList remains unchanged,
 * and the function creates a new resultList with the squared values. This is a
 * key characteristic of a pure function.
 */
