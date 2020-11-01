package com.Stack;

public class StackImpl_Array {
	
	private int[] data = new int[5];
	private int index = -1;

	public void push(int i) {
		// TODO Auto-generated method stub
		++index;
		if(index == data.length) {
			doubleTheArray(data);
			data[index] = i;
		}
		data[index] = i;
	}

	public int pop() {
		// TODO Auto-generated method stub
		if(index == -1) {
			return -1;
		}
		int popOut = data[index];  //on next push, value gets updated
		index--;   
		return popOut;
		
	}

	public int size() {
		// TODO Auto-generated method stub
		return index+1;
		
	}

	public int top() {
		// TODO Auto-generated method stub
		if(index == -1) {
			return -1;
		}
		return data[index];
		
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(index > -1) {
			return false;
		}
		return true;
		
	}
	
	public void doubleTheArray(int[] data) {
		int[] newArray = new int[data.length *2];
		for(int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}
		this.data = newArray;
	}

}
