package com.hs.all.easy;

public class MergeTwoBinaryTrees {
	public Node mergeTrees(Node root1, Node root2) {
		if (root1 == null && root2 == null)
			return null;

		int val1 = root1 != null ? root1.data : 0;
		int val2 = root2 != null ? root2.data : 0;

		Node root = new Node(val1 + val2);

		// merge left side of trees if they are not null
		root.left = mergeTrees((root1 != null && root1.left != null) ? root1.left : null,
				(root2 != null && root2.left != null) ? root2.left : null);

		// merge righ side of trees if they are not null
		root.right = mergeTrees((root1 != null && root1.right != null) ? root1.right : null,
				(root2 != null && root2.right != null) ? root2.right : null);

		return root;
	}
}
