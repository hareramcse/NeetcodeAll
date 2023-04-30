package com.hs.all.medium;

import java.util.ArrayDeque;
import java.util.Queue;

public class FindBottomLeftTreeValue {
	static class pair {
		Node node;
		int level;

		pair(Node node, int level) {
			this.node = node;
			this.level = level;
		}
	}

	public static int findBottomLeftValue(Node root) {
		Queue<pair> q = new ArrayDeque<>();
		q.add(new pair(root, 0));
		pair ans = new pair(root, 0);
		while (!q.isEmpty()) {
			pair current = q.poll();
			Node currentNode = current.node;
			int currentLevel = current.level;
			if (currentNode.left != null)
				q.add(new pair(currentNode.left, currentLevel + 1));
			if (currentNode.right != null)
				q.add(new pair(currentNode.right, currentLevel + 1));
			if (ans.level < currentLevel)
				ans = current;
		}
		return ans.node.data;
	}
}