package com;

public class CheckABNew1 {
	public static boolean bool=false;
	
	public static boolean checkingAB(String s) {
		if(s.length() == 0 || s.charAt(0)!='a' || s.charAt(0)!='b') {
			return false;
		}
		
		if(s.length() == 1 && s.charAt(0) == 'a') {
			return true;
		}
		else if(s.length() == 1 && s.charAt(0) != 'a') {
			return false;
		}
		
		if(s.length() == 2 && s=="aa") {
			return true;
		}
		else if(s.length() == 2 && s!= "aa") {
			return false;
		}
		
		if(s.length()>=3) {
			System.out.println("khghjg");
		if(s.charAt(0) == 'a') {
			System.out.println("inn");
			if(s.charAt(1) == 'a' || s.charAt(1) == 'b') {
				if(s.charAt(1) == 'b') {
					if(s.charAt(2) == 'b') {
						//boolean ans=checkingAB(s.substring(3));
						bool= true;
					}
				}
			}
		}
		else if(s.charAt(0) == 'b') {
			if(s.charAt(1) == 'b') {
				if(s.charAt(2) == 'a') {
					bool=true;
				}
			}
		}
		else {
			bool=false;
		} }
		boolean ans=checkingAB(s.substring(1));
		return ans;
	}
	public static void main(String[] args) 
	{
		boolean result=checkingAB("abb");
		System.out.println(result);

	}

}