package com.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Inbuilt_Fn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//add to map - O(1)
		map.put("abc", 1);
		map.put("qwerty" ,5);
		map.put("asdf", 12);
		
		//get value from map - O(1)
		System.out.println(map.get("abc"));
		
		//check if map contains a specific key  - O(1)
		System.out.println(map.containsKey("abc"));
		System.out.println(map.containsKey("hju"));
		
		//Stores all key set in Set DS - O(n)
		Set<String> key = map.keySet();  //stores all the keys in a Set
		for(String s : key) {
			System.out.println(s);
			System.out.println(map.get(s));
		}
		
		//check if map contains a specific value - O(n) bcoz checking every value
		System.out.println(map.containsValue(2));
		
		//map size - O(n)
		System.out.println(map.size());
		map.remove("asdf");
		System.out.println(map.size());
		
		//count of each element in a map
		int[] a = {2,11,2,2,12};
		HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		
		
		for(int i =0; i<a.length;i++) {
			int count = map1.containsKey(a[i]) ? map1.get(a[i]) : 0;
			map1.put(a[i], count + 1);
		}
		
		System.out.println(map1);
		
		//iterate a Map
		
		for(Map.Entry<Integer, Integer> entry : map1.entrySet()) {
			System.out.println("Key is  :"+ entry.getKey());
			System.out.println("Value is  :"+entry.getValue());
			
		}
	}

}
