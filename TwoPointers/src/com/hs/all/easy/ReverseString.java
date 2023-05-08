package com.hs.all.easy;

public class ReverseString {
	public char[] reverseString(char[] chars) {
		// Do not return anything, modify s in-place instead.
		int left = 0;
		int right = chars.length - 1;
		while (left <= right) {
			char tmp = chars[left];
			chars[left] = chars[right];
			chars[right] = tmp;
			left++;
			right--;
		}
		return chars;
	}

	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		String str = "My name is Khan";
		char[] chars = obj.reverseString(str.toCharArray());
		System.out.println(new String(chars));
	}
}
