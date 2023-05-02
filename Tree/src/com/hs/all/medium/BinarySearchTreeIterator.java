package com.hs.all.medium;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinarySearchTreeIterator {
	Node node;
	Queue<Integer> queue;

	public BinarySearchTreeIterator(Node root) {
		node = root;
		queue = new ArrayDeque<>();
		fillStack(node);
	}

	public void fillStack(Node node) {
		if (node.left != null) {
			fillStack(node.left);
		}
		queue.add(node.data);
		if (node.right != null) {
			fillStack(node.right);
		}
	}

	public int next() {
		while (!queue.isEmpty()) {
			return queue.poll();
		}
		return -1;
	}

	public boolean hasNext() {
		return !queue.isEmpty();
	}
}