package com.Strings;

public class ReverseString {
	
	public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length -1;
        
        while(j > i) {
        	char temp = s[i];
        	s[i] = s[j];
        	s[j] = temp;
        	i++;
        	j--;
        }
        
        for(char c : s) {
        	System.out.print(c);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] a = {'s','a','m','e'};
		reverseString(a);
		
//		int[] a1 = {1,2,3,4,5};
//		for(int i  : a1) {
//			System.out.println(i);
//		}

	}

}
