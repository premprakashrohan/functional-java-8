package com.ki.functionalInterface;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

import com.ki.functionalIntr.collections.Employee;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<Employee> e = (em) -> System.out.println(em);
		Consumer<Employee> e1 = (em) -> System.out.println(em.hashCode());
		e.andThen(e1).accept(new Employee(1, "Prem"));
		;
		IntConsumer ic = (int a) -> System.out.println(a);
		DoubleConsumer dc = (double a) -> System.out.println(a);
	}

}

class MyConsumer implements Consumer<Employee> {

	@Override
	public void accept(Employee t) {
		// TODO Auto-generated method stub

	}

}