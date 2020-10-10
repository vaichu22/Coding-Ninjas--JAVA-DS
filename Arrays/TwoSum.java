package com.Arrays;

import java.util.Arrays;

public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
        int k =0;
        int[] output = new int[2];
        int i=0;
        int j = i+1;
        while(j < nums.length) {
        	if(j == nums.length-1 && (nums[i] + nums[j] !=target)) {
        		i++;
        		j=i+1;
        	}
        	
        	if(nums[i] + nums[j] == target) {
        		//System.out.println("yay");
        		output[k] = i;
        		output[k+1] = j;
        	}
        	j++;
        }
        return output;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {};
		int[] ans = twoSum(a, 6);
		for(int i : ans) {
			System.out.println(i);
		}

	}

}
