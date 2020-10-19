package com.BinaryTree;

import java.util.Scanner;

public class BinaryTree_TakeInput {
	
	 public static BinaryTreeNode<Integer> takeInput() {
		 System.out.println("Enter the root node");
		 Scanner s = new Scanner(System.in);
		 int rootData = s.nextInt();
		 
		 if(rootData == -1) {
			 return null;
		 }
		 
		 BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		 BinaryTreeNode<Integer> leftChild = takeInput();
		 BinaryTreeNode<Integer> rightChild = takeInput();
		 root.left = leftChild;
		 root.right= rightChild;
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
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode<Integer> ans = takeInput();
		printTreeDetailed(ans);

	}

}
