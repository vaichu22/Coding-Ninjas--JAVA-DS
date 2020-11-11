package com.HashMap;

import java.util.ArrayList;

public class HashMapImpl<K,V> {
	
	ArrayList<LinkedListNode<K, V>> buckets;
	int bucketSize;
	int count;
	
	public HashMapImpl() {
		buckets = new ArrayList<LinkedListNode<K,V>>();
		bucketSize = 20; 		//created arraylist of size 20 and initialised with null
		
		for(int i = 0; i< bucketSize; i++) {
			buckets.add(null);
		}
				
	}
	
	public int size() {
		return count;
	}
	
	
	private int getBucketIndex(K key) {
		int hc = key.hashCode();
		int index = hc % bucketSize;
		return index;
	}
	
	//Doubling the size of the arraylist when load factor(n/b) > 0.7
	private void reHashing() {
		ArrayList<LinkedListNode<K, V>> temp = buckets;
		buckets = new ArrayList<>();
		
		for(int i = 0; i< 2*bucketSize; i++) {
			buckets.add(null);
		}
		count = 0;
		bucketSize = 2* bucketSize;
		
		for(int i = 0; i< temp.size(); i++) {
			LinkedListNode<K, V> head = temp.get(i);
			while(head != null) {
				K key = head.Key;
				V value = head.value;
				insert(key, value);
				head = head.next;
			}
		}
		
	}
	
	//insert <K,V> pair in hash map
	public void insert(K key, V value) {
		int bucketIndex = getBucketIndex(key);
		LinkedListNode<K, V> head = buckets.get(bucketIndex);
		//element is already there? just update existing value
		while(head != null) {
			if(head.Key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		
		//element is not there. hence add the node at the 0th position of linked list
		head = buckets.get(bucketIndex);
		LinkedListNode<K, V> newNode = new LinkedListNode<>(key, value);
		newNode.next = head;
		buckets.set(bucketIndex, newNode);
		count++;
		double loadfactor = 1.0*count/bucketSize;
		if(loadfactor > 0.7) {
			reHashing();
		}
	}
	
	//search for a value using key in bucket array
	public V getValue(K key) {
		int bucketIndex = getBucketIndex(key);
		LinkedListNode<K, V> head = buckets.get(bucketIndex);
			
		while(head != null) {
			if(head.Key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null;
	}
	
	//delete a node and return it's value
	public V removeKey(K key) {
		int bucketIndex = getBucketIndex(key);
		LinkedListNode<K, V> head = buckets.get(bucketIndex);
		LinkedListNode<K, V> prev = null;
		
		while(head != null) {
			if(head.Key.equals(key)) {
				if(prev != null) {
					prev.next = head.next;
				}else {
					buckets.set(bucketIndex, head.next);
				}
				count--;
				return head.value;
			}
			prev = head;
			head= head.next;
		}
		
		return null;
		
	}
}
