package com.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelWise_InputBT {
	
	
	public static BinaryTreeNode<Integer> getLevelwiseInput() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the root data");
		int rootData = s.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			BinaryTreeNode<Integer> front = queue.poll();
			System.out.println("Enter the left child : "+front.data);
			int leftChild = s.nextInt();
			
			if(leftChild != -1) {
				BinaryTreeNode<Integer> leftTree = new BinaryTreeNode<Integer>(leftChild);
				front.left = leftTree;
				queue.add(leftTree);
			}
			
			System.out.println("Enter the right child : "+front.data);
			int rightChild = s.nextInt();
			
			if(rightChild != -1) {
				BinaryTreeNode<Integer> rightTree = new BinaryTreeNode<Integer>(rightChild);
				front.right = rightTree;
				queue.add(rightTree);
			}
			
		}
		
		return root;
	}
	
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return;
		}
		System.out.print(root.data+":");
		if(root.left != null) {
			System.out.print(" L"+root.left.data+",");
		}
		if(root.right != null) {
			System.out.print(" R"+root.right.data);
		}
		System.out.println();
		
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
		
	}
	
	public static void printTreeLevelwise(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();
		q.add(root);
		while(!q.isEmpty()) {
			BinaryTreeNode<Integer> first = q.poll();
			System.out.println(first.data);
			if(first.left != null) {
				q.add(first.left);		
			}
			
			if(first.right != null) {
				q.add(first.right);			
			}
			//System.out.println(q);
		}
	}
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();
		q.add(root);
		while(!q.isEmpty()) {
			BinaryTreeNode<Integer> first = q.poll();
			
			System.out.print(first.data+":L:");
			if(first.left == null) {
				System.out.print(-1+",R:");
			}
			if(first.left != null) {
				System.out.print(first.left.data+",R:");
				q.add(first.left);		
			}
			
			if(first.right == null) {
				System.out.print(-1);
			}
			if(first.right != null) {
				System.out.print(first.right.data);
				q.add(first.right);			
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = getLevelwiseInput();
		printTreeDetailed(root);
		System.out.println("______________");
		//printTreeLevelwise(root);
		printLevelWise(root);
	}

}
