package com;

public class CheckABNew {
	
	public static boolean checkABNew(String s) {
		
		if(s.length() == 0) {
			return false;
		}
		
		boolean bool=checkABNew(s.substring(1));
		if(s.length() ==1) {
			if(s.charAt(0) == 'a') {
				bool=true;
			}
			else {
				bool=false;
			}
		}
		if(s.length() ==2) {
			if(s.substring(0, 2).equals("aa") || s.substring(0, 2).equals("bb")) {
				bool=true;
			}
			else {
				bool=false;
			}
		}
		if(s.length() ==3) {
			if(s.charAt(0) == 'a') 
			{
				if(s.substring(0, 3).equals("abb")) 
				{
					bool= true;
				}
				else 
				{
					bool=false;
				}
			}
			else if(s.charAt(0) == 'b') 
			{
				if(s.substring(0, 3).equals("bba")) 
				{
					bool= true;
				}
				else 
				{
					bool=false;
				}
			}
		}
		if(s.charAt(0) == 'a' && s.length() >3) {
			if(s.substring(0, 2).equals("aa") || s.substring(0, 3).equals("abb")) {
				if(s.substring(0, 3).equals("abb")) {
					if(s.charAt(3) == 'a' || s.charAt(3)== ' ') {
						bool=true;
					}
					else {
						bool= false;
					}
				}
				
			}
		}
		else if(s.charAt(0) == 'b' && s.length() >3) {
			if(s.substring(0, 2).equals("bb") || s.substring(0, 3).equals("bba")) {
				bool=true;
			}
			else {
				bool=false;
			}
		}
		return bool;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ans=checkABNew("abababa");
		System.out.println(ans);
	}

}
