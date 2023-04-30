package com.hs.all.easy;

public class ConvertSortedArrayToBinarySearchTree {
	public Node arrayToBST(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		return convertTOBST(arr, low, high);
	}

	private Node convertTOBST(int[] arr, int low, int high) {
		// Base case
		if (low > high)
			return null;

		// Get the middle element and make it root
		int mid = low + (high - low) / 2;
		Node root = new Node(arr[mid]);
		root.left = convertTOBST(arr, low, mid - 1);
		root.right = convertTOBST(arr, mid + 1, high);
		return root;
	}
}
