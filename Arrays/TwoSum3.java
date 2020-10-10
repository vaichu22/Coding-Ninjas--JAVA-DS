package com.Arrays;

import java.util.HashMap;
import java.util.Set;

public class TwoSum3 {
	
	public static int[] twoSum(int[] arr,int target) {
		HashMap<Integer, Integer>  hmap = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			hmap.put(arr[i], i);
		}
		
		Set<Integer> s = hmap.keySet();  //2,7,11,15  //9
		
		for(int i : s) {
			if(hmap.containsKey(target-i)) {
				return new int[] {hmap.get(i), hmap.get(target-i)};
			}
		}
		
		throw new IllegalAccessError("not found");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,7,11,15};
		int[] ans = twoSum(a, 9);
		for(int i : ans) {
			System.out.println(i);
		}
		

	}

}
