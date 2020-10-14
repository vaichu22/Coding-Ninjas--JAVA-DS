package com.Strings;

public class ValidPalindrome {
	
	public static boolean isPalindrome(String s) {
		
		String nospace = s.replaceAll("[\\W_]", "").toLowerCase();
		System.out.println(nospace);
		int i = 0;
		int j = nospace.length()-1;
		
		while(j>i) {
			if(nospace.charAt(i) == nospace.charAt(j)) {
				i++;
				j--;
			}
			else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str = "A man, a plan, a canal: Panama";  
//        //1st way  
//        //String noSpaceStr = str.replaceAll("\\,", "*"); // using built in method  
//		String noSpaceStr = str.replaceAll("\\W", "").toLowerCase();
//		//noSpaceStr = noSpaceStr.toLowerCase();
//		if(noSpaceStr.charAt(0) == noSpaceStr.charAt(noSpaceStr.length()-1)) {
//			System.out.println("yay");
//		}
//        System.out.println(noSpaceStr);  
        boolean ans = isPalindrome("ab+a");
        System.out.println(ans);
       

	}

}
