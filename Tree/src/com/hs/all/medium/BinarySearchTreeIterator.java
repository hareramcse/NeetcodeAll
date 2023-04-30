package com.hs.all.medium;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinarySearchTreeIterator {
	Node iterator;
	Queue<Integer> queue;

	public BinarySearchTreeIterator(Node root) {
		iterator = root;
		queue = new ArrayDeque<>();
		fillStack(iterator);
	}

	public void fillStack(Node iterator) {
		if (iterator.left != null) {
			fillStack(iterator.left);
		}
		queue.add(iterator.data);
		if (iterator.right != null) {
			fillStack(iterator.right);
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