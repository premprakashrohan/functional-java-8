package com.ki.functionalIntr.inner;

@FunctionalInterface
interface Interface {
	void myMethod();
	default  void getInstance(Interface i) {
		
	}
	 class MyInnerClass {
		 
	}
	 
	 static class MyDefaultInnerClass {
		 
		}
}

public class MyInnerClassDemo {

	public MyInnerClassDemo() {
		Interface.MyInnerClass i = new Interface.MyInnerClass();
	}

}
