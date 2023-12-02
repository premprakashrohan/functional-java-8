package com.ki.lamdaExpression;

import java.util.function.Function;

//No Access Specifier need to write
//No Return type needs to write
//No Name needs to write
//Anonymous function
public class LamdaExpressionSample implements MyPrint, MyAddition, MyStringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Function  fn= (a,b)-> a+b; 
		MyPrint mp = ()->System.out.println("Hi");
		mp.print();
		MyAddition ma = (a,b)->a+b;
		ma.add(10, 100);
		MyStringLength msl = (s)->s.length();
		msl.length("Hi");
	}

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	/**
	 * (int a, int b)->{return a+b;} 
	 * (int a, int b)->return a+b; 
	 * Based on context compiler can guise Type inference 
	 * (a,b)->return a+b;
	 */
	@Override
	public void print() {
		System.out.println("Hello");
	}

	/**
	 * ()->{System.out.println("Hello");} ()->System.out.println("Hello");
	 */

	@Override
	public int length(String s) {
		return s.length();
	}
	/**
	 * (String s)->{return s.length();} 
	 * (String s)->return s.length(); 
	 * (s)->return s.length();
	 * (s)->s.length();
	 */
}

@FunctionalInterface
interface MyPrint {
	void print();
}

@FunctionalInterface
interface MyAddition {
	int add(int a, int b);
}

@FunctionalInterface
interface MyStringLength {
	int length(String s);
}