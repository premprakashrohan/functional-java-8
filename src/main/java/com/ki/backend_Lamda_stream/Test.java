package com.ki.backend_Lamda_stream;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		String str = new String("sample");
		str = null;
		System.gc();
		Thread.sleep(1000);
		System.out.println("end of main");
		Consumer<String> c = (e) -> {
		};
		Supplier<String> s = () -> "hello";
		s = () -> {
			return "hello";
		};
		Function<Integer, String> f = (i) -> "prem" + i;
		Predicate<String> p = (i) -> true;

		// MyMathFunc m = a,b ->(a-b);
		MyMathFunc m = (a, b) -> (a - b);
		// m = (int a,int b) ->return (a-b);
		// m = (int a,int b) ->a-b;
		// m = (int a,int b) ->return (a-b);
	}

	@Override
	protected void finalize() {
		System.out.println("finalize method called");
	}
}

interface MyMathFunc {
	int operation(int a, int b);
}