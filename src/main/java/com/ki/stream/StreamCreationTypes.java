package com.ki.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamCreationTypes {

	public static void main(String[] args) {
		method1();

	}

	static void method1() {
		Stream<String> strStream = Stream.empty(); // Empty Stream
		System.out.println(strStream.count());
		// strStream = Stream.of("Hello", "World"); // Var args
		// strStream.forEach(System.out::println);
		String[] strArrray = { "Hello", "World" };
		strStream = Stream.of(strArrray); // through object
		// strStream.forEach(System.out::println);

		List<String> strList = Arrays.asList(strArrray); // through collection
		strStream = strList.stream();
		// strStream.forEach(System.out::println);

		try {
			Stream<String> strStream1 = Files.lines(Path.of("C://Users//07662W744//Documents//2.txt"));
			// strStream1.parallel().forEach(System.out::println);
			
			//strStream1.filter(n->n.)
			//peek
			//map
			//flatmap
			//sorted
			//distinct
			//limit
			//skip
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		Stream<Double> randomStream = Stream.generate(Math::random); // infinite loop
		// randomStream.forEach(System.out::println);

		Stream<Integer> intStream = Stream.iterate(1, i -> i + 1);// infinite loop
		//intStream.forEach(System.out::println);
		Predicate<Integer> pi = i -> i <= 100;
		intStream = Stream.iterate(1, pi, i -> i + 1).parallel().sequential();//  finite loop
		intStream.forEach(System.out::println);

	}

}
