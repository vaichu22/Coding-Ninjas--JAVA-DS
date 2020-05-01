package com;

import java.util.Scanner;

public class Add
{
	
	public int addNumbers(int a,int b)
	{
		return a+b;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of times ADD number func to be called: ");
		int n=s.nextInt();
		
		for(int i=0;i<n;i++)
		{
			Add a=new Add();
			System.out.println("Enter a: ");
			int a1=s.nextInt();
			System.out.println("Enter b: ");
			int b1=s.nextInt();
			System.out.println("The sum is"+a.addNumbers(a1, b1));
		}
	}
}
