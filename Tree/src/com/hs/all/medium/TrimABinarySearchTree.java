package com.hs.all.medium;

public class TrimABinarySearchTree {
	public Node trimBST(Node root, int low, int high) {
		if (root == null) {
			return root;
		}
		if (root.data > high) {
			return trimBST(root.left, low, high);
		}
		if (root.data < low) {
			return trimBST(root.right, low, high);
		}
		root.left = trimBST(root.left, low, high);
		root.right = trimBST(root.right, low, high);
		return root;
	}
}
