package com.hs.onefifty.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> ans = new ArrayList<>();
		backTrack(0, nums, ans, new ArrayList<>());
		return ans;
	}

	private static void backTrack(int i, int[] nums, List<List<Integer>> ans, List<Integer> list) {
		ans.add(new ArrayList<>(list));
		for (int k = i; k < nums.length; k++) {
			if (k != i && nums[k] == nums[k - 1])
				continue;
			list.add(nums[k]);
			backTrack(k + 1, nums, ans, list);
			list.remove(list.size() - 1);
		}
	}

	public static void main(String[] args) {
		Subset2 obj = new Subset2();
		int[] arr = { 1, 2, 2 };
		List<List<Integer>> result = obj.subsetsWithDup(arr);
		for (List<Integer> list : result) {
			System.out.println(list);
		}
	}
}