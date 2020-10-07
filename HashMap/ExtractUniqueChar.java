package com.HashMap;

import java.util.LinkedHashMap;
import java.util.Set;


public class ExtractUniqueChar {
	
	public static String uniqueChar(String s) {
		
		String output = "";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			int count = map.containsKey(s.charAt(i)) ? map.get(s.charAt(i)) : 0;
			map.put(s.charAt(i), count+1);
		}
		
		Set<Character> s1 = map.keySet();
		for(Character c : s1) {
			output += c;
		}
		
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ans = uniqueChar("abcd");
		System.out.println(ans);

	}

}
