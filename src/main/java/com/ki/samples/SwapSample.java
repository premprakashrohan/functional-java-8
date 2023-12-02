package com.ki.samples;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SwapSample {

	 private static final int N = 10;

	    private static char[] flags = new char[]{'R','B','B','R','R','B','B','R','R','B'};

	    public static void main( String... argv){

	        new String(flags).chars().mapToObj(i -> (char)i).forEach(System.out::println);

	        int m = 0,  k = 0;
	        while (m != N)  {
	            if (flags[m] == 'B') { }
	            else {
	                swap(flags,k,m); 
	                k = k+1;
	            }
	            m = m+1;
	        } 
	        new String(flags).chars().mapToObj(i -> (char)i).forEach(System.out::println);
	        
	        Stream<Character> stream1 = 
	        	    IntStream.range(0, flags.length).mapToObj(i -> (char)flags[i]);

	        	    Stream<Character> stream2 = 
	        	    IntStream.range(0, flags.length).mapToObj(i -> (char)flags[i]);


	        	    Stream.concat(stream2.filter(x-> (x == 'B')), stream1.filter( y->(y == 'R')  )).forEach(System.out::print);
	    }

	    private static void swap(char[] flags, int k, int m) {

	        char temp = flags[k];
	        flags[k] = flags[m];
	        flags[m] =  temp;

	    }


}
