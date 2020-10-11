package com.Strings;

import java.util.HashMap;

public class ValidAnagram {
	
	public static boolean isAnagram(String s, String t) {
		
		if(t.length() > s.length() || t.length() < s.length()) {
			return false;
		}
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<s.length();i++) {
			int count = (map.containsKey(s.charAt(i))) ? map.get(s.charAt(i)) : 0;
			map.put(s.charAt(i), count+1);
		}
		
		for(int i=0; i<t.length();i++) {
			if(!map.containsKey(t.charAt(i))) {
				return false;
			} else {
				if(map.get(t.charAt(i)) == 0) {
					return false;
				} else if(map.get(t.charAt(i)) > 0) {
					map.put(t.charAt(i), map.get(t.charAt(i))-1);
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ans = isAnagram("ab", "a");
		System.out.println(ans);

	}

}
