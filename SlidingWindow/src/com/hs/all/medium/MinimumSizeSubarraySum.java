package com.hs.all.medium;

public class MinimumSizeSubarraySum {
	public int minSubArrayLen(int target, int[] nums) {
		int minLength = Integer.MAX_VALUE;
		int sum = 0;
		
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			sum = sum + nums[j];
			// while sum is greater than the value of target
			while (sum >= target) {
				// Keep track of minLength
				minLength = Math.min(minLength, j - i + 1);
				// Subtract the value from sum variable and move start pointer
				sum = sum - nums[i];
				i++;
			}
		}
		return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
	}
}
