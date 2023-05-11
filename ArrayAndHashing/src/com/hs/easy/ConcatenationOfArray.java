package com.hs.easy;

import java.util.Arrays;

public class ConcatenationOfArray {
	public int[] getConcatenation(int[] nums) {
		int[] arr = new int[2 * nums.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = nums[i % nums.length];
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		ConcatenationOfArray obj = new ConcatenationOfArray();
		int[] res = obj.getConcatenation(arr);
		System.out.println(Arrays.toString(res));
	}
}
