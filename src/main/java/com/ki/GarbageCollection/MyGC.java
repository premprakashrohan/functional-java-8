package com.ki.GarbageCollection;

public class MyGC {

	public static void main(String[] args) {
		MyClassA myClassA = new MyClassA();
		MyClassB myClassB;
		for (int i = 0; i < 1000; i++) {
			myClassB = new MyClassB(i, myClassA);
			System.gc();
		}
		System.out.println(" -- end --");
	}

	private static final class MyClassA {
	}

	private static final class MyClassB {
		double[] d = new double[1000000];
		private int name;
		MyClassA myClassA;

		public MyClassB(int name, MyClassA myClassA) {
			this.name = name;
			this.myClassA = myClassA;
		}

		@Override
		protected void finalize() throws Throwable {
			System.out.println("finalized: " + name);
		}
	}
}
