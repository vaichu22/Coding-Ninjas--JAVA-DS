package com.Arrays;

public class TwoSum_WhileLoop {
	public static int[] twoSum(int[] nums, int target) {
	    int i = 0;
	    int j = 1;
	    while(i < nums.length-1 && j < nums.length) {
	        
	        if((nums[i] + nums[j]) == target) {
	            return new int[]{i,j};
	        } 
	        if(j == nums.length-1) {
	            i++;
	            j=i+1;
	        } else {
	            j++;
	        }
	    }
	    return null;
	}
	public static void main(String[] args) {
		int[] nums= {3,6,1,5,7,8,9,10};
		int[] a = twoSum(nums, 19);
		for(int i : a) {
			System.out.println(i);
		}
	}
}
