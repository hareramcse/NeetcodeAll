package com.hs.all.medium;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinarySearchTreeIterator {
	Node iterator;
	Queue<Integer> traversal;

	public BinarySearchTreeIterator(Node root) {
		iterator = root;
		traversal = new ArrayDeque<>();
		fillStack(iterator);
	}

	public void fillStack(Node iterator) {
		if (iterator.left != null) {
			fillStack(iterator.left);
		}
		traversal.add(iterator.data);
		if (iterator.right != null) {
			fillStack(iterator.right);
		}
	}

	public int next() {
		while (!traversal.isEmpty()) {
			return traversal.poll();
		}
		return -1;
	}

	public boolean hasNext() {
		return !traversal.isEmpty();
	}
}