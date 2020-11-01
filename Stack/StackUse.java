package com.Stack;

public class StackUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackImpl_Array s = new StackImpl_Array();
		s.push(5);
		s.push(10);
		s.push(15);
		s.push(20);
		s.push(25);
		s.push(30);
		s.push(35);
		s.push(40);
		s.push(38);
		s.push(78);
		
		System.out.println(s.pop());
		System.out.println(s.size());
		System.out.println(s.top());
		System.out.println(s.isEmpty());
		
		

	}

}
