package com.hs.all.easy;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		// Do not return anything, modify nums in-place instead.
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != 0) {
				int tmp = nums[i];
				nums[i] = nums[j];
				nums[j] = tmp;
				i++;
			}
		}
	}
}