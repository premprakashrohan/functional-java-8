package com.ki.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.ki.functionalIntr.collections.Employee;

public class PredicateDemo {
	static final List<Employee> employees = Arrays.asList(new Employee[] { new Employee(1, "Prem"), new Employee(2, "Prakash"),
			new Employee(3, "Rohan"), new Employee(4, "Vikramaditya"), new Employee(5, "Ishi") });

	public static void main(String[] args) {
		Predicate<Employee> emPre= e-> e.geteNo()<=2;
		System.out.println(emPre);
		Stream<Employee> s = employees.stream();
		System.out.println(s);
		s =s.filter(e-> e.geteNo()>=2);
		System.out.println(s);
		s =s.distinct();
		//System.out.println(s.findAny());
		System.out.println(s.collect(Collectors.toList()));
	}

}
