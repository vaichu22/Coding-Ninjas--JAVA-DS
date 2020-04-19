package com;

public class ArrayCheck {

	public static void arraycheck(int[] b)
	{
		int temp[]=new int[b.length-1];
		for(int i=1;i<b.length;i++) {
			System.out.println("innnn");
			temp[i-1]=b[i];
			System.out.println(b.length);
			System.out.println(temp[i-1]);
		}
		System.out.println(temp.length);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[0];  //empty array
		//System.out.println(arr.length);
		//arr[0]=5;  //Array index out of bound error
		//System.out.println(arr[0]);
		
		int[] b=new int[] {18};
		arraycheck(b);
		
		String s="";
		System.out.println(s.length());
		System.out.println(s.substring(0));
		
		System.out.println(4/10);
		String a="abc";
		
		//System.out.println(a.charAt(3));
		String str="Vaishnavi";
		String substr = str.substring(1, 5);
	      System.out.println("substring = " + substr);
	      
	      System.out.println(1/10);
	      //String sample = "Avengers"; 
	      //System.out.println(sample.charAt(-1));
	      
	      String str1 = "c";
	      System.out.println("last char = " + str1.charAt(str1.length() - 1));
	      System.out.println(str1.length());
	      
	      System.out.println(4%5);
	      s="ab";
	      
	      System.out.println(s.substring(2));
	      
	      s="";
	      System.out.println(s.length());
	      System.out.println(21^3);
	      //Read more: https://www.java67.com/2018/05/java-string-chartat-example-how-to-get-first-last-character.html#ixzz6GjX2YZ3I
	}

}
