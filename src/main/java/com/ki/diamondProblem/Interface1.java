package com.ki.diamondProblem;

import java.lang.reflect.Field;

import jdk.internal.vm.annotation.Stable;

@FunctionalInterface
interface Interface11 {
	

	void method1();

	default void log(String str) {
		System.out.println("I1 logging::" + str);
	}

	static void print(String str) {
		System.out.println("Printing " + str);
	}
	// trying to override Object method gives compile-time error as
	// "A default method cannot override a method from java.lang.Object"

//  default String toString(){
//       return "i1";
//   }
//     
}

@FunctionalInterface
interface Interface2 {
	void method1();

	default void log(String str) {
		System.out.println("I2 logging::" + str);
	}

	static void print(String str) {
		System.out.println("Printing " + str);
	}

}

abstract class MyAbstractClass implements Interface11, Interface2 {
	private String myPrivateVariable;
	protected String myProtectedVariable;
	String myDefaultVariable;
	public MyAbstractClass(String myPrivateVariable, String myProtectedVariable, String myDefaultVariable) {
		super();
		this.myPrivateVariable = myPrivateVariable;
		this.myProtectedVariable = myProtectedVariable;
		this.myDefaultVariable = myDefaultVariable;
	}
	@Stable
	private final Boolean myBool = true;
	public Boolean getMyBool() {
		return myBool;
	}

	// private abstract void myPrivateAbstractedMethod() {}; can't possible
	protected abstract void myProtectedAbstractedMethod();

	abstract void myDefaultAbstractedMethod();

	// MyClass won't compile without having it's own log() implementation
	@Override
	public void log(String str) {
		System.out.println("MyClass logging::" + str);
		Interface1.print("abc");
	}

	static void print(String str) {
		System.out.println("Printing " + str);
	}

}

public class Interface1 extends MyAbstractClass {
	 
	public Interface1(String myPrivateVariable, String myProtectedVariable, String myDefaultVariable) {
		super(myPrivateVariable, myProtectedVariable, myDefaultVariable);
		 
	}

	static void print(String str) {
		System.out.println("Printing " + str);
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void myProtectedAbstractedMethod() {
		// TODO Auto-generated method stub

	}

	@Override
	void myDefaultAbstractedMethod() {
		// TODO Auto-generated method stub

	}

	public static boolean set(Object object, String fieldName, Object fieldValue) {
	    Class<?> clazz = object.getClass();
	    while (clazz != null) {
	        try {
	            Field field = clazz.getDeclaredField(fieldName);
	            field.setAccessible(true);
	            field.set(object, fieldValue);
	            return true;
	        } catch (NoSuchFieldException e) {
	            clazz = clazz.getSuperclass();
	        } catch (Exception e) {
	            throw new IllegalStateException(e);
	        }
	    }
	    return false;
	}
	public static void main(String args[]) throws Exception {
		//Class<?> clazz = Class.forName(className);
		//Interface1 instance = new Interface1("1","2","3");
		//set(instance, "myBool", false);
		//set(instance, "myDefaultVariable", "John");
		//System.out.println(instance.getMyBool());
		String str = new String("Hello");
		System.out.println(str);
		byte[] by =  new byte[str.toCharArray().length];
		 set(str, "value", by );
		System.out.println(str);
	}
}