package com.ki.functional.programming.designpattern;

/**
 * 
 * @author premp Tail call optimization (TCO) is a compiler optimization
 *         technique that helps to avoid stack overflow errors in recursive
 *         functions by reusing the current function's stack frame for the next
 *         recursive call when certain conditions are met. In Java, the language
 *         specification does not require TCO, so it's not natively supported.
 *         However, some JVM languages or compilers might provide TCO as an
 *         optimization.
 * 
 *         Let's consider an example of a simple factorial function in Java.
 *         Since Java doesn't support TCO out of the box, we'll implement it in
 *         a hypothetical language that supports tail call optimization:
 *
 */
public class TailCallOptimization {

	// Tail-recursive factorial function.
	public static int factorial(int n) {
		return factorialTail(n, 1);
	}

	// Helper function for tail-recursive factorial.
	private static int factorialTail(int n, int accumulator) {
		if (n == 0) {
			return accumulator;
		} else {
			return factorialTail(n - 1, n * accumulator);
		}
	}

	public static void main(String[] args) {
		int n = 5;
		int result = factorial(n);
		System.out.println("Factorial of " + n + " is: " + result);
	}

}
/**
 * In this example, we have implemented a tail-recursive factorial function
 * factorial using a helper function factorialTail. The factorialTail function
 * has an extra parameter, accumulator, which accumulates the intermediate
 * results during the recursive calls.
 * 
 * If the language or compiler supports TCO, the recursive call to factorialTail
 * will be optimized to reuse the current stack frame, avoiding stack overflow
 * issues for large values of n.
 * 
 * Please note that as of my knowledge cutoff date in September 2021, Java does
 * not natively support TCO. However, other languages like Scala, Kotlin, and
 * some functional programming languages may support TCO or provide tail call
 * optimization as an optimization feature. Always refer to the latest
 * documentation and compiler features for the language you are using to
 * determine if tail call optimization is supported.
 */
