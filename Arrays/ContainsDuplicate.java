package com.Arrays;

import java.util.Arrays;

public class ContainsDuplicate {

	public static boolean containsDuplicate(int[] nums) {
        if(nums.length == 0) {
            return false;
        }
        
        Arrays.sort(nums);
        int i=0;
        for(int j=1; j<nums.length;j++) {
            if(nums[i] == nums[j]) {
            	System.out.println("yayy");
                return true;
            } else {
                i++;
            }
        }
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,1,3,3,4,3,2,4,2};
		boolean ans = containsDuplicate(a);
		System.out.println(ans);
	}

}
