package com.ki.aMyThought;

import java.text.Bidi;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import com.ki.functionalIntr.collections.Employee;
import com.ki.functionalIntr.collections.EmployeeBuilder;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.With;

public class Trial {

	public static void main(String[] args) {

		System.out.println(EmployeeBuilder.getEmployees(1, 1000).size());
		List<Employee> employeeList = EmployeeBuilder.getEmployees(1, 1000);
		Map<Integer, List<Employee>> empListBasedOnDept = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptId, Collectors.toList()));
		empListBasedOnDept.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));

		// empListBasedOnDept.getOrDefault(1, List.of()).replaceAll(null).forEach((k, v)
		// -> System.out.println("Key : " + k + ", Value : " + v));; ;
		// .forEach(System.out::println);
		employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.counting()))
				.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
		employeeList.stream().collect(Collectors.groupingBy(Employee::isStatus, Collectors.counting()))
				.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
		System.out.println(employeeList.stream().max(Comparator.comparing(Employee::getSalary)));
		System.out.println(employeeList.stream().min(Comparator.comparing(Employee::getSalary)));
		employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptId,
						Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))))
				.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
		System.out.println(employeeList.stream().mapToDouble(employee -> employee.getSalary()).average().getAsDouble());
		System.out.println("######################################################################");
		employeeList.stream().dropWhile((e)->e.getSalary()>45).forEach(System.out::println);
		//Bidi.
		
		Object obj = new Object();
		//obj.
	}

}
