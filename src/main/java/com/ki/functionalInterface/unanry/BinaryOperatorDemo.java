package com.ki.functionalInterface.unanry;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

import com.ki.functionalIntr.collections.Employee;

public class BinaryOperatorDemo {

	public static void main(String[] args) {
		BinaryOperator<Integer> iuo = (a, b) -> a * b;
		System.out.println(iuo.apply(10, 10));
		
		
		IntBinaryOperator ibo = (a,b)->a*b;
		System.out.println(ibo.applyAsInt(10, 10));
		BinaryOperator<Employee> empuo = (em1, em2) -> em1.geteNo() > em2.geteNo() ? em1 : em2;
		System.out.println(empuo.apply(new Employee(1, ""),new Employee(1, "")));
		

	}

}
