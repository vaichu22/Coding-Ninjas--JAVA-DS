package com.HashMap;

public class MapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapImpl<String, Integer> map = new HashMapImpl<String, Integer>();
		
		for(int i =0; i< 20; i++) {
			map.insert("abc"+i, i+1);
			
		}
		
		map.removeKey("abc3");
		map.removeKey("abc7");
		
		for(int i = 0; i<20; i++) {
			System.out.println("abc"+i+ " "+map.getValue("abc"+i));
		}
	}

}
