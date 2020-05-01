package com;

import java.util.Arrays;
import java.util.Scanner;

public class ChocolateCartonDistribution {
	
	public static int MinimumDifference(int[] arr,int students)
	{
		Arrays.sort(arr);
		int i=1;
		int j=students;
		int diff=arr[students-1]-arr[0];
		while(j<arr.length)
		{
			int ans=arr[j]-arr[i];
			if(ans<diff)
			{
				diff=ans;
				continue;
			}
			else
			{
				i++;
				j++;
			}
		}
		return diff;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int totalCarton=s.nextInt();
		int arr[]=new int[totalCarton];
		for(int i=0;i<totalCarton;i++)
		{
			arr[i]=s.nextInt();
		}
		int students=s.nextInt();
		int result=MinimumDifference(arr, students);
		System.out.println(result);
	}

}
