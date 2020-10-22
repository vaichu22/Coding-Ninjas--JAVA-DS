package com.BinaryTree;

import java.util.Scanner;

public class BinaryTree2 {
	
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
	
	public static int treeHeight(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		
		int leftChild = treeHeight(root.left);
		int rightChild = treeHeight(root.right);
		
		return 1 + Math.max(leftChild, rightChild);
	}
	
	
	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return true;
		}
		
		int leftHeight = treeHeight(root.left);
		int rightHeight = treeHeight(root.right);
		
		if(Math.abs(leftHeight - rightHeight) > 1) {
			return false;
		}
		
		boolean isLfetBalanced = isBalanced(root.left);
		boolean isRightBalanced = isBalanced(root.right);
		
		return isLfetBalanced && isRightBalanced;
		
		
	}
	
	public static BTBalanced_Return isBalancedBetter(BinaryTreeNode<Integer> root) {
		if(root == null) {
			BTBalanced_Return ans = new BTBalanced_Return(0, true);
			return ans;
		}
	
		BTBalanced_Return leftTree = isBalancedBetter(root.left);
		BTBalanced_Return rightTree = isBalancedBetter(root.right);
		int height = 1 + Math.max(leftTree.height, rightTree.height);
		boolean isBal = true;
		if(Math.abs(leftTree.height - rightTree.height) > 1) {
			isBal = false;
		}
		
		if(!leftTree.isBalanced || !rightTree.isBalanced) {
			isBal = false;
		}
		
		BTBalanced_Return ans1 = new BTBalanced_Return(height, isBal);
		return ans1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode<Integer> root = takeInputBetter(true, 0, false);
		printTreeDetailed(root);
		
		System.out.println("is Balanced : "+isBalanced(root));
		System.out.println("is Balanced Better : "+isBalancedBetter(root).isBalanced);

	}

}
