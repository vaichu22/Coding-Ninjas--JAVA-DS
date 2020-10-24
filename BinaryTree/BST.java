package com.BinaryTree;

import java.util.Scanner;

public class BST {
	
	public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot, int parentData, boolean isLeft) {
		 if(isRoot) {
			System.out.println("Enter the root node"); 
		 }
		 else {
			 if(isLeft) {
				 System.out.println("Enter the left child of :"+parentData);
			 } else {
				 System.out.println("Enter the right child of :"+parentData);
			 }
		 }
		 Scanner s = new Scanner(System.in);
		 int rootData = s.nextInt();
		 
		 if(rootData == -1) {
			 return null;
		 }
		 
		 BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		 BinaryTreeNode<Integer> leftChild = takeInputBetter(false, rootData, true);
		 BinaryTreeNode<Integer> rightChild = takeInputBetter(false, rootData, false);
		 root.left = leftChild;
		 root.right= rightChild;
		 return root;
	 }
	
	public static boolean searchElementinBST(BinaryTreeNode<Integer> root, int data) {
		if(root == null) {
			return false;
		}
		
		if(root.data == data) {
			return true;
		}
		
		if(root.data > data) {
			boolean leftTree = searchElementinBST(root.left, data);
			return leftTree;
		}
		
		return searchElementinBST(root.right, data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode<Integer> root = takeInputBetter(true, 0, false);
		System.out.println(searchElementinBST(root, 6));

	}

}
