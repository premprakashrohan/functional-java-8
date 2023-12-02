package com.ki.functionalIntr;

/**
 * 
 * @author 07662W744
 * 
 *         older Abstract method Callable Runnable ActionListner Comparable
 *
 */
@FunctionalInterface
public interface Interface {
	// Compulsory required
	// only one abstract method need
	void method();

	default void defMethod(String str, String str1) {
		System.out.println("Interface.defMethod");
	}

	default void defMethod(String str) {
		System.out.println("Interface.defMethod1");
	}

	static void staticMethod() {
		System.out.println("Interface.defMethod1");
	}
	static class C1{}
	class C2{}
}

@FunctionalInterface
interface AnotherFunctionalInterface extends Interface {
	void method();

	// void method1(); can have abstract method but should same // CE with invalid
	// @FunctionalInterface
	default void defMethod(Interface i) {
		i.method();
		System.out.println("AnotherInterface.defMethod");
	}
}

interface AnotherInterface extends Interface, AnotherFunctionalInterface {
	void method(); // can override 
	
	// can have abstract method but should same as parent class
	
	void method2();

	default void defMethod(String a) {
		System.out.println("AnotherInterface.defMethod");
	}
}

class MyClass implements Interface, AnotherInterface {
	@Override
	public void method() {
		System.out.println("MyClass.method");
	}

	public static void main(String[] args) {
		Interface i = ()->System.out.println("Hi");
		i.method();
		MyClass c = new MyClass();
		c.defMethod(() -> {
			System.out.println("Hi");
		}); // prints always lower method from inheritance
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub

	}
}