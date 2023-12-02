package com.ki.GarbageCollection;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Arrays;

public class PhantomRefExample {
	public static void main(String[] args) {
		//System.out.println(Arrays.equals(new char[] {'a','b','c'}, new char[] {'a','b','c','d'}));
		//System.out.println(Arrays.equals(new String[] {"Hello"}, new String[] {"Hello"}));
		//System.out.println(Arrays.equals(new MyObject[] {new MyObject("phantom")}, new MyObject[] {new MyObject("phantom")}));
		ReferenceQueue<MyObject> referenceQueue = new ReferenceQueue<>();

		MyObject myObject1 = new MyObject("phantom");
		Reference<MyObject> ref = new PhantomReference<>(myObject1, referenceQueue);
		System.out.println("ref#get(): " + ref.get());
		MyObject myObject2 = new MyObject("normal");

		// make objects unreacheable
		myObject1 = null;
		myObject2 = null;

		if (checkObjectGced(ref, referenceQueue)) {
			takeAction();
		}

		System.out.println("-- do some memory intensive work --");
		for (int i = 0; i < 10; i++) {
			int[] ints = new int[100000];
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		}
		if (checkObjectGced(ref, referenceQueue)) {
			takeAction();
		}
	}

	private static boolean checkObjectGced(Reference<MyObject> ref, ReferenceQueue<MyObject> referenceQueue) {
		boolean gced = false;
		System.out.println("-- Checking whether object garbage collection due --");
		Reference<? extends MyObject> polledRef = referenceQueue.poll();
		System.out.println("polledRef: " + polledRef);
		System.out.println("Is polledRef same: " + (gced = polledRef == ref));
		if (polledRef != null) {
			System.out.println("Ref#get(): " + polledRef.get());
		}
		return gced;
	}

	private static void takeAction() {
		System.out.println("pre-mortem cleanup actions");
	}
}
