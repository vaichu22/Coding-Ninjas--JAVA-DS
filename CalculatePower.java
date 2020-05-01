package com;

import java.util.Scanner;

public class CalculatePower {
	
	public static int power(int val, int pow) {
		if(pow==1)
		{
			return 1*val;
		}
		int small=power(val,pow-1);
		int res=val*small;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int val=s.nextInt();
		int pow=s.nextInt();
		
		int answer=power(val,pow);
		System.out.println(answer);

	}

}
