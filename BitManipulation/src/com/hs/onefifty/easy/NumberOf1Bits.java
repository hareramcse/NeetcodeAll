package com.hs.onefifty.easy;

public class NumberOf1Bits {
	public int hammingWeight(int n) {
		int count = 0;
		while (n != 0) {
			n = n & (n - 1);
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		NumberOf1Bits obj = new NumberOf1Bits();
		int n = 000000000000000000000010101011;
		int result = obj.hammingWeight(n);
		System.out.println(result);
	}
}
