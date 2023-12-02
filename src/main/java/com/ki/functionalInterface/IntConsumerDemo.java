package com.ki.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

import org.jooq.lambda.fi.util.function.CheckedObjIntConsumer;

import com.ki.functionalIntr.collections.Employee;

public class IntConsumerDemo {

	public static void main(String[] args) {
		IntConsumer ic = (e) -> System.out.println("The squireof e is: " + e * e);
		LongConsumer lc = (e) -> System.out.println("The squireof e is: " + e * e);
		DoubleConsumer dc = (e) -> System.out.println("The squireof e is: " + e * e);
		ic.accept(10);
		lc.accept(10l);
		dc.accept(10.9);
		CheckedObjIntConsumer<Employee> objic = (emp, e) -> emp.seteNo(e);
		ObjLongConsumer<Employee> objlc = (emp, e) -> emp.setSalary(emp.getSalary() + e);
		ObjDoubleConsumer<Employee> objdc = (emp, e) -> emp.setSalary(emp.getSalary() + e);
		List<Integer> arr = Arrays.asList(3, 2, 5, 7, 4);

		// Instantiate the ObjIntConsumer interface
		ObjIntConsumer<List<Integer>> func = (list, num) -> {
			list.stream().forEach(a -> System.out.println(a * num));
		};
		func.accept(arr, 2);

	}

}
