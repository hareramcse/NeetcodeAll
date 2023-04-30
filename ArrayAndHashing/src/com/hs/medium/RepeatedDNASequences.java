package com.hs.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequences {
	public List<String> findRepeatedDnaSequences(String s) {
		Set<String> set = new HashSet<>();
		Set<String> ans = new HashSet<>();
		
		int start = 0;
		for (int end = 10; end <= s.length(); end++) {
			if (set.contains(s.substring(start, end)))
				ans.add(s.substring(start, end));
			
			set.add(s.substring(start, end));
			start++;
		}
		List<String> list = new ArrayList<>(ans);
		return list;
	}
}
