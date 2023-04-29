package com.hs.array.all.easy;

public class FindPivotIndex {
	public int pivotIndex(int[] nums) {
		int totalSum = 0;
		for (int i = 0; i < nums.length; i++) {
			totalSum += nums[i];
		}
		int leftSum = 0;
		for (int i = 0; i < nums.length; i++) {
			int rightSum = totalSum - leftSum - nums[i];
			if (leftSum == rightSum) {
				return i;
			}
			leftSum += nums[i];
		}
		return -1;
	}
}
