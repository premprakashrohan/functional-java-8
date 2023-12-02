package com.ki.optional;

import java.util.Optional;
import java.util.function.Supplier;

import com.ki.functionalIntr.collections.Employee;

public class OptionalDemo {

	public static void main(String[] args) throws Exception {
		Employee emp = new Employee(1, "Prem");
		System.out.println(emp.hashCode());
		
		Optional<Employee> empOpt = Optional.empty();
		System.out.println(empOpt.hashCode());
		System.out.println(empOpt.isEmpty());
		System.out.println(empOpt.isPresent());
		//Supplier<Exception> se = ()->new Exception("Null Value!");
		//empOpt.orElseThrow(se);
		emp = empOpt.orElse(emp);
		System.out.println(empOpt.hashCode()); //0
		System.out.println(empOpt.hashCode());
		
		
		
		
		empOpt = Optional.of(emp);
		System.out.println(empOpt.hashCode());
		empOpt = Optional.of(emp);
		System.out.println(empOpt.hashCode());
		empOpt = Optional.ofNullable(emp);
		System.out.println(empOpt.hashCode());

	}

}
