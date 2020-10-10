package com.Arrays;

public class TwoSum2 {
	
	public static int[] twoSum(int[] nums, int target) {
	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[j] == target - nums[i]) {
	                return new int[] { i, j };
	            }
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,7,11,15};
		int[] ans = twoSum(a, 17);
		for(int i : ans) {
			System.out.println(i);
		}

	}

}
