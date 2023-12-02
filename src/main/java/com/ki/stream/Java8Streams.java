package com.ki.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Streams {
	public static Boolean check(String str) {
		System.out.println("1");
		return str.isEmpty();
	}

	public static void main(String args[]) { // Count the empty strings
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		Objects.requireNonNull(strList);
		List<String> asList = strList.parallelStream().dropWhile(Java8Streams::check).collect(ArrayList::new,
				ArrayList::add, ArrayList::addAll);
		System.out.println(asList.hashCode());
		System.out.println(strList.hashCode());
		long count = strList.stream().filter(x -> x.isEmpty()).count();
		System.out.printf("List %s has %d empty strings %n", strList, count);
		long count1 = strList.stream().filter(Java8Streams::check).count();
		System.out.printf("List %s has %d empty strings %n", strList, count1);

		// Count String with length more than 3
		long num = strList.stream().filter(x -> x.length() > 3).peek(System.out::println).count();
		System.out.printf("List %s has %d strings of length more than 3 %n", strList, num);

		// Count number of String which startswith "a"
		count = strList.stream().filter(x -> x.startsWith("a")).count();
		System.out.printf("List %s has %d strings which startsWith 'a' %n", strList, count);

		// Remove all empty Strings from List
		List<String> filtered = strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
		System.out.printf("Original List : %s, List without Empty Strings : %s %n", strList, filtered);

		// Create a List with String more than 2 characters
		filtered = strList.stream().filter(x -> x.length() > 2).collect(Collectors.toList());
		System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered);

		// Convert String to Uppercase and join them using coma
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(G7Countries);

		// Create List of square of all distinct numbers
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		List<Integer> distinct = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		System.out.printf("Original List : %s, Square Without duplicates : %s %n", numbers, distinct);

		// Get count, min, max, sum, and average for numbers
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("Highest prime number in List : " + stats.getMax());
		System.out.println("Lowest prime number in List : " + stats.getMin());
		System.out.println("Sum of all prime numbers : " + stats.getSum());
		System.out.println("Average of all prime numbers : " + stats.getAverage());
		primes = Collections.unmodifiableList(primes);
		// primes.add(31);

		final ImmutableArray<String> sample = ImmutableArray.from(new String[] { "a", "b", "c" });

		Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream();

		Integer lastElement2 = stream.reduce((first, second) -> second).orElse(-1);

		System.out.println(lastElement2);
		Stream<Integer> emptyStream = Stream.empty();

		Integer lastElement = emptyStream.reduce((first, second) -> second).orElse(-1);

		System.out.println(lastElement); // -1

		// or

		Stream<Integer> emptyStream1 = Stream.empty();

		Integer lastElement1 = emptyStream1.reduce((first, second) -> second)
				.orElseThrow(() -> new IllegalStateException("no last element"));

	}

	static class ImmutableArray<T> {
		private final T[] array;

		private ImmutableArray(T[] a) {
			array = Arrays.copyOf(a, a.length);
		}

		public static <T> ImmutableArray<T> from(T[] a) {
			return new ImmutableArray<T>(a);
		}

		public T get(int index) {
			return array[index];
		}
	}
}
