package com.ki.samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		List<String> crunchifyList = new ArrayList<String>();

		crunchifyList.add("Google");
		crunchifyList.add("Facebook");
		crunchifyList.add("Twitter");
		crunchifyList.add("Snap Inc");
		crunchifyList.add("Crunchify LLC");
		crunchifyList.add("TechCrunch");
		crunchifyList.add("Verizon");

		List<String> newList = new ArrayList<String>(crunchifyList);

		// Print list before any operation.
		System.out.println("Printing result before any Operation: \t" + crunchifyList);

		// Randomly permutes the specified list using a default source of randomness.
		Collections.shuffle(crunchifyList);
		System.out.println("Printing result after shuffle(): \t" + crunchifyList);

		// Reverses the order of the elements in the specified list.
		Collections.reverse(crunchifyList);
		System.out.println("Printing result after reverse(): \t" + crunchifyList);

		// Copies all of the elements from one list into another.
		Collections.copy(newList, crunchifyList);
		System.out.println("Printing result after copy(): \t\t" + newList);

		// Rotates the elements in the specified list by the specified distance.
		Collections.rotate(newList, 2);
		System.out.println("Printing result after rotate(): \t" + newList);

		// Returns the number of elements in this list.
		System.out.println("Printing total count using size(): \t" + newList.size());

		// Swaps the elements at the specified positions in the specified list.
		Collections.swap(newList, 2, 4);
		System.out.println("Printing result after swap(): \t\t" + newList);
		Collections.swap(newList, 0	, 2);
		System.out.println("Printing result after swap(): \t\t" + newList);
	}

}
