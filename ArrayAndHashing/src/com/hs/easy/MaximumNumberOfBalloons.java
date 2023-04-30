package com.hs.easy;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons {
	public int maxNumberOfBalloons(String text) {
		Map<Character, Integer> balloon = new HashMap<>();
		Map<Character, Integer> countText = new HashMap<>();

		for (char c : "balloon".toCharArray()) {
			balloon.put(c, balloon.getOrDefault(c, 0) + 1);
		}

		for (char c : text.toCharArray()) {
			countText.put(c, balloon.getOrDefault(c, 0) + 1);
		}

		int res = text.length();
		for (Character c : balloon.keySet()) {
			res = Math.min(res, countText.getOrDefault(c, 0) / balloon.get(c));
		}

		return res;
	}
}