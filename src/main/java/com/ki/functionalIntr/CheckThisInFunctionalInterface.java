package com.ki.functionalIntr;

interface Interface1 {
	int a = 10;

	void print();
}

public class CheckThisInFunctionalInterface {
	int x = 100;

	public void print(int abc) {
		int y = 11;  // final or effectively final variable; if not instantiated then can not use at lambda function
		Interface1 i = () -> {
			int x = 90; // local variable present in function
			System.out.println(this.x); // prints 100 because this always access class not functional interface
			System.out.println(x); // local variable Not instance variable
			System.out.println(y); // local variable Not instance variable
			System.out.println(abc); // local variable Not instance variable
		};
		i.print();
		//y=22; if try to change then error comes inside lambda function.
		//abc=33;  if try to change then error comes inside lambda function.
	}
	
	public void print1() {
		Interface1 i2 = new Interface1() {
			int x = 100;
			@Override
			public void print() {
				System.out.println(this.x); 
				System.out.println(x);
			}
		};
		i2.print();
	}
	
	public static void main(String[] args) {
		CheckThisInFunctionalInterface ctifi = new CheckThisInFunctionalInterface();
		ctifi.print(44);
		ctifi.print1();
		
	}

}

/**
 * Class without name                        Function without name
 * extends and implements                    Not
 * Many methods								Not
 * Heap area								Method area
 * 
 * 
 */
