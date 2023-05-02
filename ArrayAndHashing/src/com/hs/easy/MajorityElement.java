package com.hs.easy;

public class MajorityElement {
	public int majorityElement(int[] nums) {
		int res = 0, count = 0;
		for (int n : nums) {
			if (count == 0)
				res = n;
			
			count += (res == n ? 1 : -1);
		}

		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
		MajorityElement obj = new MajorityElement();
		int result = obj.majorityElement(arr);
		System.out.println(result);
	}
}