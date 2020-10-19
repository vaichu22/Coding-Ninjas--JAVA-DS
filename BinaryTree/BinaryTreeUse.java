package com.BinaryTree;

public class BinaryTreeUse {
	
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
	
	public static void printTree(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return;
		}
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
		
		BinaryTreeNode<Integer> left = new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> right = new BinaryTreeNode<Integer>(3);
		
		BinaryTreeNode<Integer> child11 = new BinaryTreeNode<Integer>(4);
		BinaryTreeNode<Integer> child21 = new BinaryTreeNode<Integer>(5);
		
		root.left = left;
		root.right = right;
		
		left.right = child11;
		right.left = child21;
		
		//printTree(root);
		printTreeDetailed(root);

	}

}
