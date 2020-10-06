package com.HashMap;

import java.util.HashMap;

public class PrintIntersection {
	
	public static void printIntersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		for(int i=0; i< arr1.length;i++) {												//O(m)
			int freq = (hmap.containsKey(arr1[i])) ? hmap.get(arr1[i]) : 0;
			hmap.put(arr1[i], freq + 1);
			
		}
		
		for(int i=0;i<arr2.length;i++) {												//O(n)
			if(hmap.containsKey(arr2[i])) {
				if(hmap.get(arr2[i]) > 0) {
					System.out.println(arr2[i]);
					hmap.replace(arr2[i], hmap.get(arr2[i])-1);
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {10,10};
		int[] arr2 = {2,10};
		
		printIntersection(arr1, arr2);													//O(m+n) - total time complexity
	}

}
