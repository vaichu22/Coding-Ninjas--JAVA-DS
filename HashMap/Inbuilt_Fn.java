package com.HashMap;

import java.util.HashMap;
import java.util.Set;


public class Inbuilt_Fn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 1);
		map.put("qwerty" ,5);
		
		System.out.println(map.get("abc"));
		
		
		System.out.println(map.containsKey("abc"));
		System.out.println(map.containsKey("hju"));
		
		Set<String> key = map.keySet();  //stores all the keys in a Set
		for(String s : key) {
			System.out.println(s);
		}
		
		System.out.println(map.containsValue(2));
	}

}
