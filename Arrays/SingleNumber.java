package com.Arrays;

import java.util.HashMap;
import java.util.Set;

public class SingleNumber {
	
	 public static int singleNumber(int[] nums) {
	        int single = 0;
	        HashMap<Integer, Integer> hmap = new HashMap<>();
	        for(int i=0;i<nums.length;i++) {
	            int count = (hmap.containsKey(nums[i])) ? hmap.get(nums[i]) : 0;
	            hmap.put(nums[i], count+1);
	        }
	        System.out.println(hmap);
	        Set<Integer> s = hmap.keySet();
	        for(Integer i : s) {
	        	System.out.println(i);
	            if(hmap.get(i) == 1) {
	                single = i;
	            }
	        }
	        return single;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {4,1,2,1,2};
		int ans = singleNumber(a);
		System.out.println(ans);

	}

}
