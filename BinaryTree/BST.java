package com.BinaryTree;

import java.util.ArrayList;
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
	
	public static void printElementsInRangeK1K2(BinaryTreeNode<Integer> root, int k1, int k2) {
		if(root == null) {
			return;
		}
		
		if(root.data <= k1) {
			printElementsInRangeK1K2(root.right, k1, k2);
		} else if(root.data >= k2) {
			printElementsInRangeK1K2(root.left, k1, k2);
		} else if(root.data >= k1 && root.data <= k2) {
			System.out.println(root.data+" ");
			printElementsInRangeK1K2(root.left, k1, k2);
			printElementsInRangeK1K2(root.right, k1, k2);
		}
	}
	
	public static int maximum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		
		int left = maximum(root.left);
		int right = maximum(root.right);
		
		return Math.max(root.data, Math.max(left, right));
	}
	
	public static int minimum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		
		int left = minimum(root.left);
		int right = minimum(root.right);
		
		return Math.min(root.data, Math.min(left, right));
	}
	
	public static boolean isBST(BinaryTreeNode<Integer> root) {  //worst case - O(n^2), best case - O(n log n)
		if(root == null) {
			return true;
		}
		
		int leftMax = maximum(root.left);
		int rightMin = minimum(root.right);
		
		if(root.data <= leftMax) {
			return false;
		}
		
		if(root.data > rightMin) {
			return false;
		}
		
		boolean leftTree = isBST(root.left);
		boolean rightTree = isBST(root.right);
		
		return leftTree && rightTree;
	}
	
	public static BST_Return isBSTBetter(BinaryTreeNode<Integer> root) {  // worst and best case - O(n)
		if(root == null) {
			BST_Return bst = new BST_Return(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
			return bst;
		}
		
		BST_Return left = isBSTBetter(root.left);
		BST_Return right = isBSTBetter(root.right);
		
		int min = Math.min(root.data, Math.min(left.min, right.min));
		int max = Math.max(root.data, Math.max(left.max, right.max));
		boolean isBST = true;
		
		if(root.data <= left.max) {
			isBST =  false;
		}
		
		if(root.data > right.min) {
			isBST =  false;
		}
		
		if(!left.isBST) {
			isBST = false;
		}
		
		if(!right.isBST) {
			isBST = false;
		}
		
		BST_Return bst = new BST_Return(min, max, isBST);
		return bst;
		
	}
	
	public static boolean isBSTBetter2(BinaryTreeNode<Integer> root, int minRange, int maxRange) {
		if(root == null) {
			return true;
		}
		
		if(root.data < minRange || root.data > maxRange) {
			return false;
		}
		
		boolean isLeftWithinRange = isBSTBetter2(root.left, minRange, root.data - 1);
		boolean isRightWithinRange = isBSTBetter2(root.right, root.data, maxRange);
		
		return isLeftWithinRange && isRightWithinRange;
	}
	
	public static ArrayList<Integer> printNodeToRoot_PathBT(BinaryTreeNode<Integer> root, int x) {
		if(root == null) {
			return null;
		}
		
		if(root.data == x) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(root.data);
			return list;
		}
		
		ArrayList<Integer> leftOutput = printNodeToRoot_PathBT(root.left, x);
		if(leftOutput != null) {
			leftOutput.add(root.data);
			return leftOutput;
		}
		
		ArrayList<Integer> rightOutput = printNodeToRoot_PathBT(root.right, x);
		if(rightOutput != null) {
			rightOutput.add(root.data);
			return rightOutput;
		}
		
		return null;
		
	}
	
	public static ArrayList<Integer> findPathBST(BinaryTreeNode<Integer> root, int data){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        
        if(root == null) {
            return null;
        }
        
        if(root.data == data) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(root.data);
            return list;
        }
        
        if(root.data > data) {
            ArrayList<Integer> leftOutput = findPathBST(root.left, data);
            if(leftOutput != null) {
                leftOutput.add(root.data);
                return leftOutput;
            }
        }
        
        if(root.data < data) {
            ArrayList<Integer> rightOutput = findPathBST(root.right, data);
            if(rightOutput != null) {
                rightOutput.add(root.data);
                return rightOutput;
            }
        }
        
        return null;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode<Integer> root = takeInputBetter(true, 0, false);
		//System.out.println(searchElementinBST(root, 6));
		//printElementsInRangeK1K2(root, 7, 20);
        boolean ans = isBST(root);
        System.out.println(ans);
        
        BST_Return output = isBSTBetter(root);
        System.out.println(output.isBST);
        
        System.out.println(isBSTBetter2(root, 1, 7));
		ArrayList<Integer> ans1 = printNodeToRoot_PathBT(root, 3);
		for(int i : ans1) {
			System.out.println(i);
		}
	}

}
