package com.ki.functionalIntr.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class MyList {

	public static void main(String[] args) {
		Comparator<String> ascComp = (s1, s2) -> s1.compareTo(s2);
		Comparator<Integer> ascIntegerComp = (s1, s2) -> s1 > s2 ? -1 : s1 < s2 ? 1 : 0;
		Comparator<Integer> descIntegerComp = (s1, s2) -> s1 > s2 ? 1 : s1 < s2 ? -1 : 0;
		Comparator<String> descComp = (s1, s2) -> s2.compareTo(s1);
		List<String> i = Arrays.asList(new String[] { "Prem", "Prakash", "Rohan", "Sahil", "Vikramaditya", "Ishi" });
		//i= i.stream().filter((s)->s.isBlank()).toList();
		System.out.println(i);
		Collections.sort(i, ascComp);
		System.out.println(i);
		Collections.sort(i, descComp);
		System.out.println(i);
		i = new LinkedList(i);
		System.out.println(i);

		i = new Vector<String>(i);
		System.out.println(i);

		Stack s = new Stack<String>();
		s.addAll(Arrays.asList(new String[] { "Prem", "Prakash", "Rohan", "Sahil", "Vikramaditya", "Ishi" }));
		System.out.println(s.peek());
		System.out.println(s.peek());

		System.out.println(Arrays.equals(new String[] { "Prem", "Prakash", "Rohan", "Sahil", "Vikramaditya", "Ishi" },
				new String[] { "Prem", "Prakash", "Rohan", "Sahil", "Vikramaditya", "Ishi" }));
		List<Employee> emps = Arrays.asList(new Employee[] { new Employee(1, "Prem"), new Employee(2, "Prakash"),
				new Employee(3, "Rohan"), new Employee(4, "Vikramaditya"), new Employee(5, "Ishi") });
		Comparator<Employee> descCompc = (s1, s2) -> s1.geteNo()>s2.geteNo()?-1:s1.geteNo()<s2.geteNo()?1:0;
		Collections.sort(emps, descCompc);
		System.out.println(emps);

	}

}
