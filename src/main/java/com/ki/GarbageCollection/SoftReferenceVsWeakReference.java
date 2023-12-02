package com.ki.GarbageCollection;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SoftReferenceVsWeakReference {

	public static void main(String[] args) throws InterruptedException {
		// softRefrence();
		weakReference();
	}

	public static void softRefrence() throws InterruptedException {
		List<Reference<MyObject>> references = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			// create soft reference
			MyObject myObject = new MyObject("soft " + i);
			Reference<MyObject> ref = new SoftReference<>(myObject);
			references.add(ref);
			// without wrapping in any reference
			new MyObject("normal " + i);
		}
		// let see which ones' get() will return null
		printReferences(references);
	}

	public static void weakReference() {
		List<Reference<MyObject>> references = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			MyObject myObject = new MyObject("weak " + i);
			Reference<MyObject> ref = new java.lang.ref.WeakReference<MyObject>(myObject);
			references.add(ref);
			new MyObject("normal " + i);
		}
		printReferences(references);
	}

	public static void printReferences(List<Reference<MyObject>> references) {
		ExecutorService ex = Executors.newSingleThreadExecutor();
		ex.execute(() -> {
			try {
				// sleep a little in case if finalizers are currently running
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("-- printing references --");
			references.stream().forEach(SoftReferenceVsWeakReference::printReference);
		});
		ex.shutdown();
	}

	public static void printReference(Reference<MyObject> r) {
		System.out.printf("Reference: %s [%s]%n", r.get(), r.getClass().getSimpleName());
	}

}

class MyObject {
	private int[] ints = new int[1000];
	private final String name;

	public MyObject(String name) {
		this.name = name;
		System.out.println(name);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(ints);
		result = prime * result + Objects.hash(name);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyObject other = (MyObject) obj;
		return Arrays.equals(ints, other.ints) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.printf("Finalizing: %s%n", name);
	}
}
