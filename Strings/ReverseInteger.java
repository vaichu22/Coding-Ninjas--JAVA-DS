package com.Strings;

public class ReverseInteger {
	
	public static int reverse(int x) { 

	if(x > Integer.MAX_VALUE/10) {
		System.out.println("yay");
		return 0;
	}
	
	if(x == 0) {
		return x;
	}
	
	int smallOutput = reverse(x/10);
	String s = Integer.toString(Math.abs(x));
	
	if(smallOutput != 0 ) {
		return (int) ((x%10)*(Math.pow(10, s.length()-1)) + smallOutput);
	}
	return (int) ((x%10)*(Math.pow(10, s.length()-1)));
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans = reverse(123);
		System.out.println(ans);
		

	}
}
