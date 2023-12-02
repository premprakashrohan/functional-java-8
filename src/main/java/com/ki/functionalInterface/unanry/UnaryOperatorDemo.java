package com.ki.functionalInterface.unanry;

import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		UnaryOperator<Integer> uo = (a)->a*a; //For object
		System.out.println(uo.apply(10));
		IntUnaryOperator iuo =(a)->a/10;
		System.out.println(iuo.applyAsInt(100));
		LongUnaryOperator luo =(a)->a/10l;
		System.out.println(luo.applyAsLong(100l));

	}

}
