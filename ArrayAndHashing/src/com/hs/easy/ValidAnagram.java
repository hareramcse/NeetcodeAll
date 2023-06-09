package com.hs.easy;

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;

		int[] count = new int[26];
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
			count[t.charAt(i) - 'a']--;
		}

		for (int i : count)
			if (i != 0)
				return false;

		return true;
	}

	public static void main(String[] args) {
		ValidAnagram obj = new ValidAnagram();
		String s = "anagram";
		String t = "nagaram";
		boolean anagram = obj.isAnagram(s, t);
		System.out.println(anagram);
	}
}