package com.hs.all.medium;

public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {
		if (head == null || head.next == null || k == 0)
			return head;

		ListNode current = head;

		int length = 1;
		while (current.next != null) {
			length++;
			current = current.next;
		}

		current.next = head;
		k = k % length;
		k = length - k;
		while (k > 0) {
			k--;
			current = current.next;
		}

		head = current.next;
		current.next = null;
		return head;
	}
}