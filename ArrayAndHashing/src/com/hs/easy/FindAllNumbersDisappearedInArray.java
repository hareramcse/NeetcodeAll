package com.hs.easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInArray {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;
			if (nums[index] > 0)
				nums[index] = -nums[index];
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0)
				ans.add(i + 1);
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 4, 4, 4, 8 };
		FindAllNumbersDisappearedInArray obj = new FindAllNumbersDisappearedInArray();
		List<Integer> res = obj.findDisappearedNumbers(arr);
		System.out.println(res);
	}
}