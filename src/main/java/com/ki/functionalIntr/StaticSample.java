package com.ki.functionalIntr;

import jakarta.validation.groups.Default;

interface InterfaceontainsStatic {
	//Non overriding concept
	static void myStaticMethod() {

	}
	default void myDefaultMethod() {
		
	}
}

public class StaticSample implements InterfaceontainsStatic {
	//we can change scope and write because not have override
	private static void myStaticMethod() {

	}
	//below can not posible
	//private default void myDefaultMethod() {}

	static void myClassStaticMethod() {

	}

	public static void main(String[] args) {
		StaticSample ss = new StaticSample();
		// ss.myStaticMethod();Not required!!!
		ss.myClassStaticMethod();

	}

}
