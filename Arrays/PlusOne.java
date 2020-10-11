package com.Arrays;

public class PlusOne {
	
	public static int[] plusOne(int[] digits) {
		
		int n = digits.length;
		
		for(int i= n-1; i>=0; i--) {
			if(digits[i] == 9) {
				digits[i] =0;
			}
			else {
				digits[i]++;
				return digits;
			}
		}
		
		digits = new int[n+1];
		digits[0] = 1;
		return digits;		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] a = {9,8,7,6,5,4,3,2,1,0};
		int[] a = {9,9,9};
		int[] answer = plusOne(a);
		
		for(int i=0;i<answer.length;i++) {
			System.out.print(answer[i]);
		}

	}

}
