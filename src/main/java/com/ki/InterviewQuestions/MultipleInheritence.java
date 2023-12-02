package com.ki.InterviewQuestions;

public class MultipleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface Engine {
	default String make() {
		return "DEFAULT_MAKE";
	}
	default String a1() {
		return "DEFAULT_MAKE";
	}
}

interface Vehicle {
	default String model() {
		return "DEFAULT_MODEL";
	}
	
	default String a1() {
		return "DEFAULT_MAKE";
	}
}
abstract class  Car implements Engine,Vehicle{
	String makeAndModel() {
		return Engine.super.make()+Vehicle.super.model();
	}

	@Override
	public String a1() {
		return Engine.super.a1();
	}

	
}