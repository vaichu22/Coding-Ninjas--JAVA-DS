package com.Arrays;

public class RotateArray {
	
	public static void rotate(int[] nums, int k) {
		if(nums.length == 0) {
			return;
		}
		
		if(nums.length == 1) {
			System.out.println(nums[0]);
		}
		
		if(nums.length == 2) {
			while(k >= 1) {
				int t = nums[0];
				nums[0] = nums[1];
				nums[1] = t;
				k--;
			}
		}
		
		if(nums.length > 2) {
			while(k >= 1) {
				int temp = nums[nums.length-1];
				int i = nums.length -1;
				
				for(int j= nums.length-2; j>=0; j--) {
					nums[i] = nums[j];
					i--;
				}
				nums[0] = temp;
				k--;
			}
		}
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5};
		rotate(a, 3);
		
	}

}
