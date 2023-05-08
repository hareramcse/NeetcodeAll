package com.hs.medium;

public class MinimumNumberOfSwapsToMakeTheStringBalanced {
	public int minSwaps(String s) {
		int close = 0;
		int maxClose = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ']') {
				close++;
			} else {
				close--;
			}

			maxClose = Math.max(maxClose, close);
		}
		return (maxClose + 1) / 2;
	}

	public static void main(String[] args) {
		MinimumNumberOfSwapsToMakeTheStringBalanced obj = new MinimumNumberOfSwapsToMakeTheStringBalanced();
		String str = "]]][[[";
		int res = obj.minSwaps(str);
		System.out.println(res);
	}
}