package com.BinaryTree;

import java.util.Scanner;

public class BinaryTree_TakeInput {
	
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
	 
	 public static int noOfNodes(BinaryTreeNode<Integer> root) {
		 if(root == null) {
			 return 0;
		 }
		 
		 int leftNodeCount = noOfNodes(root.left);
		 int rightNodeCount = noOfNodes(root.right);
		 return 1 + leftNodeCount + rightNodeCount;
	 }
	 
	 public static int sumOfNodes(BinaryTreeNode<Integer> root) {
		 if(root == null) {
			 return 0;
		 }
		 
		 int leftChildNode = sumOfNodes(root.left);
		 int rightChildNode = sumOfNodes(root.right);
		 
		 return root.data + leftChildNode + rightChildNode;
	 }
	 
	 public static int largestNode(BinaryTreeNode<Integer> root) {   //Time complexity - O(N), Space Complexity - O(H)
		 if(root == null) {
			 return -1;
		 }
		 
		 int largestLeft = largestNode(root.left);
		 int largestRight = largestNode(root.right);
		 return Math.max(root.data, Math.max(largestLeft, largestRight));
	 }
	 
	 public static int noOfLeafNodes(BinaryTreeNode<Integer> root) {
		 if(root == null) {
			 return 0;
		 }
		 
		 if(root.left == null && root.right == null) {
			 return 1;
		 }
		 
		 int leftChildNodes = noOfLeafNodes(root.left);
		 int rightChildNodes = noOfLeafNodes(root.right);
		 
		 return leftChildNodes + rightChildNodes;
	 }
	 
	 public static void printTreeAtDepthK(BinaryTreeNode<Integer> root, int k) {
		 if(root == null) {
			 return;
		 }
		 
		 if(k == 0) {
			 System.out.println(root.data);
			 return;
		 }
		 
		 printTreeAtDepthK(root.left, k-1);
		 printTreeAtDepthK(root.right, k-1);
	 }
	 
	 public static BinaryTreeNode<Integer> removeLeafNodes(BinaryTreeNode<Integer> root) {
		 if(root == null) {
			 return null;
		 }
		 
		 if(root.left == null && root.right == null) {
			 return null;
		 }
		 
		 root.left = removeLeafNodes(root.left);
		 root.right = removeLeafNodes(root.right);
		 return root;
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BinaryTreeNode<Integer> ans = takeInput();
		BinaryTreeNode<Integer> ans1 = takeInputBetter(true, 0, false);
		printTreeDetailed(ans1);
		int output = noOfNodes(ans1);
		System.out.println("No of nodes : "+output);
		int o1= sumOfNodes(ans1);
		System.out.println("Sum of nodes : "+o1);
		System.out.println("Largest Node is :"+ largestNode(ans1));
		
		int o2 = noOfLeafNodes(ans1);
		System.out.println("No of leaf nodes :"+o2);
		
		System.out.println("___________");
		printTreeAtDepthK(ans1, 0);
		BinaryTreeNode<Integer> rootNode = removeLeafNodes(ans1);
		printTreeDetailed(rootNode);
	}

}


//N - No of nodes in the input tree
//H - Height of the input tree