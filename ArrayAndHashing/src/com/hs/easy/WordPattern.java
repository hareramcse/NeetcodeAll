package com.hs.easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	public boolean wordPattern(String pattern, String s) {
		String[] arr = s.split(" ");

		// prevent out of boundary problem
		if (arr.length != pattern.length())
			return false;

		Map<Character, String> map = new HashMap<>();
		for (int i = 0; i < pattern.length(); i++) {
			Character sChar = pattern.charAt(i);
			String tString = arr[i];

			if (map.containsKey(sChar)) {
				String value = map.get(sChar);
				if (!value.equals(tString))
					return false;
			} else if (map.containsValue(tString)) {
				return false;
			} else {
				map.put(sChar, tString);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String pattern = "abba";
		String s = "dog cat cat dog";
		WordPattern obj = new WordPattern();
		boolean result = obj.wordPattern(pattern, s);
		System.out.println(result);
	}
}