package com.ki.functionalIntr.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(4, "Vikramaditya");
		map.put(5, "Ishi");
		map.put(1, "Prem");
		map.put(22, "Prakash");
		map.put(33, "Rohan");
		System.out.println(map);
		map = new TreeMap<Integer, String>(map);
		System.out.println(map);
		Comparator<Integer> ascIntegerComp = (s1,s2)-> s1>s2?-1:s1<s2?1:0 ;
		Map<Integer, String> map2 = new TreeMap<Integer, String>(ascIntegerComp);
		map2.putAll(map);
		System.out.println(map2);
		Comparator<Integer> descIntegerComp = (s1,s2)-> s1>s2?1:s1<s2?-1:0 ;
		map2 = new TreeMap<Integer, String>(descIntegerComp);
		map2.putAll(map);
		System.out.println(map2);
		
	}

}
