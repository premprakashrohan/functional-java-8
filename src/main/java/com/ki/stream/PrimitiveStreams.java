package com.ki.stream;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveStreams {

	public static void main(String[] args) {
	IntStream iStream = IntStream.generate(()->(int)(Math.random()*100));
	iStream.forEach(System.out::println);;
	;
	//DoubleStream dStream = DoubleStream.generate(Math::random);
	
	new Random().ints().forEach(System.out::println);
	}

}
