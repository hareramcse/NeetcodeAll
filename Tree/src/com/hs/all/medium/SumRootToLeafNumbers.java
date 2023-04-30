package com.hs.all.medium;

import java.util.ArrayList;
import java.util.List;

public class SumRootToLeafNumbers {
	public int sumNumbers(Node root) {
		// track the sum that we want to add
		int solution = 0;

		// execute a dfs to find the leaf nodes
		solution = findLeafNodes(root, solution);

		// return the solution
		return solution;
	}

	// dfs method
	public int findLeafNodes(Node node, int currentPath) {
		// base case, if no node then return 0
		if (node == null) {
			return 0;
		}

		// add the current node value to the currentPath (move decimal to right by 1 and
		// add)
		currentPath = (currentPath * 10) + node.data;

		// if we are at a non-null node, check if it is a leaf
		if (node.left == null && node.right == null) {
			// return the solution
			return currentPath;
		}

		// check find the leaf nodes on the left and right
		return findLeafNodes(node.left, currentPath) + findLeafNodes(node.right, currentPath);
	}

	public static void main(String[] args) {
		SumRootToLeafNumbers tree = new SumRootToLeafNumbers();

		Node root = new Node(1);
		root.left = new Node(3);
		root.left.left = new Node(2);
		root.left.right = new Node(1);
		root.left.right.left = new Node(1);
		root.right = new Node(-1);
		root.right.left = new Node(4);
		root.right.left.left = new Node(1);
		root.right.left.right = new Node(2);
		root.right.right = new Node(5);
		root.right.right.right = new Node(2);

		int count = tree.sumNumbers(root);
		System.out.println(count);
	}
}
