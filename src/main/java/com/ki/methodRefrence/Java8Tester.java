package com.ki.methodRefrence;

import java.util.ArrayList;
import java.util.List;

public class Java8Tester {
	public static void main(String args[]) {
	      List<String> names = new ArrayList();
			
	      names.add("Mahesh");
	      names.add("Suresh");
	      names.add("Ramesh");
	      names.add("Naresh");
	      names.add("Kalpesh");
			
	      names.stream().takeWhile(e->e.startsWith("M")).map(s->new String(s)).forEach(System.out::println);
	   }
}
