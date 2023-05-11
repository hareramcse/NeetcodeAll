package com.hs.all.easy;

public class ArrangingCoins {
	public int arrangeCoins(int n) {
		if (n <= 1)
			return n;

		if (n <= 3)
			return n == 3 ? 2 : 1;

		// Binary Search space will start from 2 to n/2.
		long low = 2;
		long high = n / 2;
		while (low <= high) {
			long mid = low + (high - low) / 2;
			long coinsFilled = mid * (mid + 1) / 2;
			if (coinsFilled == n) {
				return (int) mid;
			}
			if (coinsFilled < n) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return (int) high;
	}
}