package com;

public class CheckAB {
	
	public static boolean checkAB(String s) {
		
		if(s.length() == 0) {
			return false;
		}
		
		boolean bool=checkAB(s.substring(1));
		if(s.charAt(0) == 'a' && s.length() >3)  
		{
			if((s.charAt(1) == 'a' || s.charAt(1) == 'b') && (s.charAt(2) == 'b')) 
			{
				
				if(s.charAt(2) == 'b')
				{
					if(s.charAt(3) == 'a')
					{
						bool=true;
					}
					else
					{
						bool=false;
					}
				}	
			}
		}
		else if(s.charAt(0) == 'b' && s.length() >3)
		{
			if(s.charAt(1) == 'b' && s.charAt(2) == 'a')
			{
				bool=true;
			}
		}
		else if((s.charAt(0) == 'a' && s.length() ==1) || (s.charAt(0) == 'b' && s.length() ==1))
		{
			bool=true;
		}
		else if((s.charAt(0) == 'a' && s.length() <=3))
		{
			if(s.charAt(1) == 'b' && s.charAt(2) == 'b')
			{
				if(s.charAt(2) == 'b')
				{
					if(s.charAt(3) == 'a')
					{
						bool=true;
					}
					else
					{
						bool=false;
					}
				}
			}
		}
		else if((s.charAt(0) == 'b' && s.length() <=3))
		{
			if(s.charAt(1) == 'b' && s.charAt(2) == 'a')
			{
				bool=true;
			}
		}
		else
		{
			bool=false;
			
		}
		return bool;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ans=checkAB("abb");
		System.out.println(ans);

	}

}
