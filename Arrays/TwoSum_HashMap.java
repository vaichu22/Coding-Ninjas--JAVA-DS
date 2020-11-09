package com.Arrays;

import java.util.HashMap;

public class TwoSum_HashMap {
	
	public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for(int i =0 ; i<nums.length; i++) {
            int compliment = target - nums[i];
            if(hmap.containsKey(compliment)) {
                return new int[]{hmap.get(compliment), i};
            }
            hmap.put(nums[i], i);  //over-riding of duplicate keys won't happen
        }
        
          return null;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,6,9,3};
		int[] a = twoSum(nums, 9);
		for(int i : a) {
			System.out.println(i);
		}
	}

}
