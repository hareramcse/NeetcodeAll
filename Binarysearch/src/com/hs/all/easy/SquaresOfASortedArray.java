package com.hs.all.easy;

import java.util.Arrays;

public class SquaresOfASortedArray {
	public int[] sortedSquares(int[] nums) {
		int i = 0;
		int j = nums.length - 1;
		int[] res = new int[nums.length];
		int k = nums.length - 1;
		while (i <= j) {
			int leftSquare = nums[i] * nums[i];
			int rightSquare = nums[j] * nums[j];

			if (leftSquare > rightSquare) {
				res[k--] = leftSquare;
				i++;
			} else {
				res[k--] = rightSquare;
				j--;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		SquaresOfASortedArray obj = new SquaresOfASortedArray();
		int[] nums = { -4, -1, 0, 3, 10 };
		int[] result = obj.sortedSquares(nums);
		System.out.println(Arrays.toString(result));
	}
}