package com.ki.functional.programming.designpattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Immutability {
	// Immutable class representing a Point with x and y coordinates
	public static final class Point {
		private final int x;
		private final int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

		// No setter methods to modify x and y, making the class immutable
	}

	public static void main(String[] args) {
		// Create a new Point object
		Point point = new Point(5, 10);

		// Accessing the properties of the Point object
		System.out.println("Initial Point: (" + point.getX() + ", " + point.getY() + ")");

		// Attempting to modify the Point object (immutable objects cannot be changed)
		// Uncommenting the following lines will result in a compilation error.
		// point.setX(8);
		// point.setY(15);

		// Create a list of Points (immutability in collections)
		List<Point> points = new ArrayList<>();
		points.add(new Point(1, 2));
		points.add(new Point(3, 4));

		// Make the list immutable using Collections.unmodifiableList
		List<Point> immutablePoints = Collections.unmodifiableList(points);

		// Attempting to modify the immutable list (will result in an
		// UnsupportedOperationException)
		// Uncommenting the following line will result in a runtime exception.
		// immutablePoints.add(new Point(6, 7));

		// Accessing elements of the immutable list
		System.out.println("Immutable List: " + immutablePoints.get(0).getX() + ", " + immutablePoints.get(0).getY());
	}
}
/*
 * 
 * In this example, we create an immutable class Point that represents a 2D
 * point with x and y coordinates. The class has no setter methods, which means
 * the x and y values cannot be modified after the object is created, ensuring
 * immutability.
 * 
 * Additionally, we demonstrate immutability in collections by using
 * Collections.unmodifiableList to create an immutable view of a list of Point
 * objects. Once the list is made immutable, attempting to modify it will result
 * in an UnsupportedOperationException.
 * 
 * Keep in mind that the immutability of objects and collections provides
 * several benefits, including thread safety, better predictability, and ease of
 * reasoning about code. It also helps prevent bugs related to unintended side
 * effects when objects are shared across different parts of the codebase.
 */