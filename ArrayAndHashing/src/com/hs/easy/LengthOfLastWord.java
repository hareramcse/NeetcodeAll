package com.hs.easy;

public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
		int i = s.length() - 1, length = 0;
		
		while (s.charAt(i) == ' ') {
			i--;
		}
		while (i >= 0 && s.charAt(i) != ' ') {
			length++;
			i--;
		}
		return length;
	}
}
