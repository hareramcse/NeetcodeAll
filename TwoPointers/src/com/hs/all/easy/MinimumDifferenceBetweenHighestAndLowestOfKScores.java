package com.hs.all.easy;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestAndLowestOfKScores {
	public int minimumDifference(int[] nums, int k) {
		if (k == 1)
			return 0;

		Arrays.sort(nums);
		int min = Integer.MAX_VALUE;

		int i = 0;
		int j = 0;
		while (j < nums.length) {
			if (j - i + 1 == k) {
				int diff = Math.abs(nums[i] - nums[j]);
				min = Math.min(diff, min);
				i++;
			}
			j++;
		}
		return min;
	}

	public static void main(String[] args) {
		MinimumDifferenceBetweenHighestAndLowestOfKScores obj = new MinimumDifferenceBetweenHighestAndLowestOfKScores();
		int[] arr = { 9, 4, 1, 7 };
		int k = 2;
		int res = obj.minimumDifference(arr, k);
		System.out.println(res);
	}
}