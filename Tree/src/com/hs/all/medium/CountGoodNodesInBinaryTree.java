package com.hs.all.medium;

public class CountGoodNodesInBinaryTree {
	public int goodNodes(Node root) {
		return helper(root, -99999);
	}

	public int helper(Node root, int max) {
		if (root == null)
			return 0;

		int res = root.data >= max ? 1 : 0;

		max = Math.max(root.data, max);
		res += helper(root.left, max);
		res += helper(root.right, max);

		return res;
	}
}
