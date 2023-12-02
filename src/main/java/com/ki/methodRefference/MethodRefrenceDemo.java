package com.ki.methodRefference;

public class MethodRefrenceDemo {

	public MethodRefrenceDemo() {
		super();
		System.out.println("Hello from constructor!!");
	}

	public static void main(String[] args) {
		// Static method reference
		Sayble sayble = MethodRefrenceDemo::mReference1;
		System.out.println(sayble.hashCode());
		sayble.say();
		// Object method reference
		sayble = new MethodRefrenceDemo()::mReference2;
		System.out.println(sayble.hashCode());
		sayble.say();
		//Constructor reference
		sayble = MethodRefrenceDemo::new;
		System.out.println(sayble.hashCode());
		sayble.say();
		Sayble2 sayble2 = MethodRefrenceDemo::new;
		System.out.println(sayble2.hashCode());
		MethodRefrenceDemo mrd = sayble2.say();
		System.out.println(mrd);
		 

	}

	public static void mReference1() {
		System.out.println("Hello From Static!!");
	}

	public void mReference2() {
		System.out.println("Hello from object method!!!");
	}

}

interface Sayble {
	void say();
}
interface Sayble2 {
	MethodRefrenceDemo say();
}
