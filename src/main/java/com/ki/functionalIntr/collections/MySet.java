package com.ki.functionalIntr.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {

	public static void main(String[] args) {
		Set<String> i = new HashSet<String>(
				Arrays.asList(new String[] { "Prem", "Prakash", "Rohan", "Sahil", "Vikramaditya", "Ishi" }));
		System.out.println(i);
		i = new LinkedHashSet<String>(
				Arrays.asList(new String[] { "Prem", "Prakash", "Rohan", "Sahil", "Vikramaditya", "Ishi" }));
		System.out.println(i);
		i = new TreeSet<String>(i);
		System.out.println(i);
		
		i = new TreeSet<String>(i);
		System.out.println(i);
	}

}
