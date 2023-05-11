package com.hs.easy;

import java.util.Arrays;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int i = 0;
		int j = nums.length - 1;
		while (i <= j) {
			if (nums[i] == val) {
				swap(nums, i, j);
				j--;
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
		int[] arr = { 0, 1, 2, 2, 3, 0, 4 };
		RemoveElement obj = new RemoveElement();
		obj.removeElement(arr, 2);
		System.out.println(Arrays.toString(arr));
	}
}