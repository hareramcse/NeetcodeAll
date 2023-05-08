package com.hs.all.medium;

import java.util.Arrays;

public class BoatsToSavePeople {
	public int numRescueBoats(int[] people, int limit) {
		Arrays.sort(people);
		int left = 0;
		int right = people.length - 1;
		int res = 0;
		while (left <= right) {
			int remaining = limit - people[right];
			right--;

			if (left <= right && remaining >= people[left]) {
				left++;
			}
			
			res++;
		}
		return res;
	}
}
