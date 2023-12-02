package com.ki.threds;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		// a ConcurrentHashMAp of string keys and Long values
		ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();
		map.put("apple", 3);
		map.put("mango", 4);
		System.out.println("map before calling compute: " + map);
		
		// in JDK 8 - you can also use compute() and lambda expression to
		// atomically update a value or mapping in ConcurrentHashMap
		map.compute("apple", (key, value) -> value == null ? 1 : value + 1);
		System.out.println("map after calling compute on apple: " + map);
		
		// you can also use computeIfAbsent() or computeIfPresent() method
		// Constructor of LongAdder will be only called when a value for
		// given key is not exists
		ConcurrentMap<String, LongAdder> map2 = new ConcurrentHashMap<>();
		System.out.println("map with LongAdder before calling compute: " + map2);
		map2.computeIfAbsent("apple", key -> new LongAdder()).increment();
		map2.computeIfAbsent("mango", key -> new LongAdder()).increment();
		map2.computeIfAbsent("apple", key -> new LongAdder()).increment();
		System.out.println("map with LongAdder after calling compute on apple, mango, apple: " + map2);

	}

}
