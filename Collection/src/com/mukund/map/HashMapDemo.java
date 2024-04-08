package com.mukund.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		//Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("Rohit", 90);
		map.put("Virat", 99);
		map.put("Sachin", 100);
		map.put("Kaif", 55);
		map.put("Hardick", 999);
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		Collection<Integer> values = map.values();
		System.out.println(values);
		System.out.println(map.get("Sachin"));
		
		for(String key : keySet) {
			System.out.println("Key: "+key+" Values: "+map.get(key));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
