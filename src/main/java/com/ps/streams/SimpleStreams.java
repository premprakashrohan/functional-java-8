package com.ps.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SimpleStreams {
	public static void main(String... str) {
		// filter

		// The ‘filter’ method is used to eliminate elements based on a criteria. The
		// following code segment prints a count of empty strings using filter.
		List<String> strings = Arrays.asList("abc", "", "abc", "bc", "efg", "abcd", "", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println(filtered);
		List<String> distinct = strings.stream().distinct().filter(string -> !string.isEmpty()).skip(4)
				.collect(Collectors.toList());
		System.out.println(distinct);
		System.out.println(strings.stream().filter(string -> !string.isEmpty()).count());
		System.out.println(strings.stream().allMatch(string -> string.equals("abc"))); // return false
		System.out.println(strings.stream().anyMatch(string -> string.equals("abc"))); // return true
		System.out.println(strings.stream().findFirst().get()); // return "abc"
		System.out.println(strings.stream().isParallel()); // return "abc"
		System.out.println(strings.parallelStream().isParallel()); // return "abc"
		System.out.println(strings.parallelStream().isParallel()); // return "abc"
		// map

		// The ‘map’ method is used to map each element to its corresponding result. The
		// following code segment prints unique squares of numbers using map.
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		// get list of unique squares
		List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		System.out.println(squaresList);
		
		
		//limit

		//The ‘limit’ method is used to reduce the size of the stream. The following code segment shows how to print 10 random numbers using limit.
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);

		/////////////////////////sorted

		//The ‘sorted’ method is used to sort the stream. The following code segment shows how to print 10 random numbers in a sorted order.

		random = new Random();
		random.ints().limit(10).sorted().forEach(System.out::println);

		//Parallel Processing

		//parallelStream is the alternative of stream for parallel processing. Take a look at the following code segment that prints a count of empty strings using parallelStream.

		 strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

		//get count of empty string
		long count = strings.parallelStream().filter(string -> string.isEmpty()).count();

		//It is very easy to switch between sequential and parallel streams.
		//Collectors

		//Collectors are used to combine the result of processing on the elements of a stream. Collectors can be used to return a list or a string.

		strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

		System.out.println("Filtered List: " + filtered);
		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);

		//Statistics

		//With Java 8, statistics collectors are introduced to calculate all statistics when stream processing is being done.

		List integers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		IntSummaryStatistics stats = integers.stream().mapToInt((x) -> (int)x).summaryStatistics();

		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());


	}
}
