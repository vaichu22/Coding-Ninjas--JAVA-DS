package com.HashMap;

import java.util.HashMap;

public class PrintSumTo0 {
	
	public static void PairSum(int[] a) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<a.length;i++) {
			int freq = (map.containsKey(a[i])) ? map.get(a[i]) : 0;
			map.put(a[i], freq +1);
		}
		//System.out.println(map);
		
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(-a[i])) {
				if(map.get(a[i]) > 0) {
					System.out.println(-a[i]+""+a[i]);
					map.replace(a[i], map.get(a[i]) -1);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,1,-2,2,3};
		PairSum(a);

	}

}
