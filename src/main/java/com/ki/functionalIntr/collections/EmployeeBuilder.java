package com.ki.functionalIntr.collections;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.ki.random.RandomAll;

public class EmployeeBuilder {
	static public List<Employee> getEmployees(int count, int limit) {
		return IntStream.iterate(0, i -> i + 1).parallel().limit(limit)
				.mapToObj(i -> new Employee(RandomAll.getInt(count, limit), RandomAll.getString(10),
						RandomAll.getDouble(count, limit),RandomAll.getInt(1, 10),RandomAll.getBoolean()))
				.collect(Collectors.toList());
	}
}
