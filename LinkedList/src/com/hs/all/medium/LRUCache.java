package com.hs.all.medium;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	Map<Integer, Node> map = new HashMap<>();
	Node head, tail;
	int capacity;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		head = new Node(0, 0);
		tail = new Node(0, 0);
		head.next = tail;
		tail.prev = head;
	}

	public int get(int key) {
		if (map.containsKey(key)) {
			Node node = map.get(key);
			remove(node);
			insert(node);
			return node.value;
		} else {
			return -1;
		}
	}

	public void put(int key, int value) {
		if (map.containsKey(key)) {
			remove(map.get(key));
		}
		if (map.size() == capacity) {
			remove(tail.prev);
		}
		insert(new Node(key, value));
	}

	private void remove(Node node) {
		map.remove(node.key);
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}

	private void insert(Node node) {
		map.put(node.key, node);
		node.next = head.next;
		node.next.prev = node;
		head.next = node;
		node.prev = head;
	}
}

class Node {
	int key, value;
	Node prev, next;

	Node(int key, int value) {
		this.key = key;
		this.value = value;
	}
}