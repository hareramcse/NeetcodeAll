package com.hs.all.medium;

public class SortList {
	public ListNode mergeSort(ListNode head) {
		// Base case : if head is null, or there is only node
		if (head == null || head.next == null) {
			return head;
		}

		// get the middle of the list
		ListNode middle = getMiddle(head);
		ListNode nextOfMiddle = middle.next;

		// set the next of middle ListNode to null
		middle.next = null;

		// Apply mergeSort on left list
		ListNode left = mergeSort(head);

		// Apply mergeSort on right list
		ListNode right = mergeSort(nextOfMiddle);

		// Merge the left and right lists
		ListNode sortedlist = merge(left, right);
		return sortedlist;
	}

	private ListNode getMiddle(ListNode head) {
		// Base case
		if (head == null) {
			return head;
		}
		ListNode slow = head;
		ListNode fast = head.next;

		// Move fast by two and slow by one
		// Finally slow will point to middle ListNode
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	private ListNode merge(ListNode head1, ListNode head2) {
		// Base cases
		if (head1 == null)
			return head2;

		if (head2 == null)
			return head1;

		// Pick either a or b, and recur
		if (head1.val <= head2.val) {
			head1.next = merge(head1.next, head2);
			return head1;
		} else {
			head2.next = merge(head1, head2.next);
			return head2;
		}
	}

	public static void main(String[] args) {
		SortList list = new SortList();
		ListNode head = LinkedListUtil.addLast(null, 15);
		head = LinkedListUtil.addLast(head, 10);
		head = LinkedListUtil.addLast(head, 5);
		head = LinkedListUtil.addLast(head, 20);
		head = LinkedListUtil.addLast(head, 3);
		head = LinkedListUtil.addLast(head, 2);
		head = LinkedListUtil.addLast(head, 25);

		System.out.println("Linked List without sorting is :");
		LinkedListUtil.printLinkedList(head);

		head = list.mergeSort(head);
		System.out.print("\nSorted Linked List is: \n");
		LinkedListUtil.printLinkedList(head);
	}
}