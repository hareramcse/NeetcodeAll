package com.hs.all.easy;

public class SubtreeOfAnotherTree {
	public boolean isSubtree(Node root, Node subRoot) {
		if (root == null && subRoot == null)
			return true;

		if (root == null || subRoot == null)
			return false;

		if (isSameTree(root, subRoot))
			return true;

		return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
	}

	public boolean isSameTree(Node a, Node b) {
		if (a == null && b == null)
			return true;

		if (a == null || b == null)
			return false;

		if (a.data != b.data)
			return false;

		boolean left = isSameTree(a.left, b.left);
		boolean right = isSameTree(a.right, b.right);

		return left && right;
	}
}