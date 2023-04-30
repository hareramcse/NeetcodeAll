package com.hs.all.easy;

public class ReverseString {
	public void reverseString(char[] s) {
		// Do not return anything, modify s in-place instead.
		int left = 0;
		int right = s.length - 1;
		while (left <= right) {
			char tmp = s[left];
			s[left] = s[right];
			s[right] = tmp;
			left++;
			right--;
		}
	}
}
