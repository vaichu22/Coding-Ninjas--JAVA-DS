package com.Strings;

import java.util.LinkedHashMap;
import java.util.Set;

public class FirstUniqueCharacter {
	
	public static int firstUniqChar(String s) {
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(int i=0; i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), s.length()+1);
				continue;
			}
			map.put(s.charAt(i), i);
		}
		
		Set<Character> s1 = map.keySet();
		for(char c : s1) {
			if(map.get(c) != s.length()+1) {
				return map.get(c);
			}
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "loveleetcode";
		int ans = firstUniqChar(s);
		System.out.println(ans);
	}

}
