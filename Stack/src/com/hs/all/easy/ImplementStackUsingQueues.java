package com.hs.all.easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementStackUsingQueues {
	Deque<Integer> q;

	public ImplementStackUsingQueues() {
		this.q = new ArrayDeque<>();
	}

	public void push(int x) {
		q.addLast(x);
	}

	public int pop() {
		int size = q.size();
		for (int i = 0; i < size - 1; i++)
			push(q.pollFirst());
		
		return q.pollFirst();
	}

	public int top() {
		int size = q.size();
		for (int i = 0; i < size - 1; i++)
			push(q.pollFirst());

		int res = q.peekFirst();
		push(q.pollFirst());
		return res;
	}

	public boolean empty() {
		return q.size() == 0;
	}
}