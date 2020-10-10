package com.Arrays;

public class PlusOne {
	
	public static int[] plusOne(int[] digits) {
		//int n =0;
		String s = "";
		
		for(int i=0; i<digits.length;i++) {
			//n+=Integer.parseInt(Integer.toString(digits[i]));
			s += Integer.toString(digits[i]);
		}
		int n = Integer.parseInt(s);
		n+=1;
		String ans = Integer.toString(n);
		//System.out.println(ans);
		
		int[] output = new int[ans.length()];
		for(int i=0;i<ans.length();i++) {
			//System.out.println(ans.charAt(i));
			output[i] = Integer.parseInt(String.valueOf(ans.charAt(i)));
		}
		//System.out.println(output[0]);
		return output;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {9,8,7,6,5,4,3,2,1,0};
		int[] answer = plusOne(a);
		
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}

	}

}
