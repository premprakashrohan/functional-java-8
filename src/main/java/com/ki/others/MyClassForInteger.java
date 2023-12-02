package com.ki.others;

public class MyClassForInteger {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Integer i1 = 10;
		Integer i2 = Integer.valueOf(10);
		
		System.out.println(i==i1);

		System.out.println(i2==i1);

		System.out.println(i==i2);
		Integer i3 = Integer.valueOf(10);
		System.out.println(i2==i3);
		Integer i4 = new Integer(10);

		System.out.println(i==i4);


	}

}
