package com.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MaxFrequencyNumber {
	
	public static int maxFrequency(int[] a) {
		
		int max = Integer.MIN_VALUE;
		int freqNum = 0;
		System.out.println(max);
		//HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();    //Has Map stores the key in ascending order - order gets changes
		LinkedHashMap<Integer, Integer> hmap = new LinkedHashMap<Integer, Integer>();  // key is as it is like the original input
		for(int i=0;i<a.length;i++) {
			int count = (hmap.containsKey(a[i])) ? hmap.get(a[i]) : 0;
			hmap.put(a[i], count+1);
		}
		System.out.println(hmap);
		for(Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
			if(entry.getValue() > max) {
				max = entry.getValue();
				freqNum = entry.getKey();
				System.out.println("inside: "+freqNum);
			}
		}
		return freqNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2, 12, 2, 11, 12, 2, 1, 2, 2, 11, 12, 2, 6 };
		//int b[] = {6, 1, 4, 5};
		int ans  = maxFrequency(a);
		System.out.println(ans);
		
	}

}
