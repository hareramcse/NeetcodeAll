package com.hs.all.medium;

public class InsertIntoABinarySearchTree {
	public Node insert(Node root, int data) {
		if (root == null) {
			root = new Node(data);
		} else {
			if (data < root.data) {
				root.left = insert(root.left, data);
			} else {
				root.right = insert(root.right, data);
			}
		}
		return root;
	}
}
