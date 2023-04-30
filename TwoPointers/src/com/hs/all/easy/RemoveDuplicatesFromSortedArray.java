package com.hs.all.easy;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
		int i = 1;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[j - 1]) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int result = obj.removeDuplicates(nums);
		System.out.println(result);
	}
}
