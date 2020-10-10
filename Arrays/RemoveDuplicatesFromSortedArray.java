package com.Arrays;

public class RemoveDuplicatesFromSortedArray {
	
	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0) return 0;
		int i =0;
		for(int j=1; j<nums.length;j++) {
			if(nums[j] == nums[i]) {
				//j++;
				continue;
			} else if(nums[j] != nums[i]){
				i++;
				nums[i] = nums[j];
			}
		}
        
		return i+1;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {0,0,1,1,1,2,3};
		int len = removeDuplicates(a);
		for(int i=0;i<len;i++) {
			System.out.println(a[i]);
		}

	}

}
