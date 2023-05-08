package com.hs.all.easy;

import java.util.Arrays;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {
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

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };
		MoveZeroes obj = new MoveZeroes();
		obj.moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}
}