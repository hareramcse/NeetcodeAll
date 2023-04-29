package com.hs.array.onefifty.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> uniques = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (uniques.contains(nums[i])) {
				return true;
			}
			uniques.add(nums[i]);
		}
		return false;
	}
}
