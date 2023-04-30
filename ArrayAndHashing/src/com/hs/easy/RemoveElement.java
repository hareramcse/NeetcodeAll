package com.hs.easy;

import java.util.Arrays;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int length = nums.length - 1;
		int i = 0;
		while (i <= length) {
			if (nums[i] == val) {
				swap(nums, i, length);
				length--;
			} else {
				i++;
			}
		}
		return i;
	}

	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 2, 3, 0, 4, 2 };
		RemoveElement obj = new RemoveElement();
		obj.removeElement(arr, 2);
		System.out.println(Arrays.toString(arr));
	}
}
