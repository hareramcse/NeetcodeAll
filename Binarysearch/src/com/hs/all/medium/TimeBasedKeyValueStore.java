package com.hs.all.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeBasedKeyValueStore {
	Map<String, List<Pair>> map;

	public TimeBasedKeyValueStore() {
		map = new HashMap<>();
	}

	public void set(String key, String value, int timestamp) {
		if (!map.containsKey(key))
			map.put(key, new ArrayList<>());
		List<Pair> list = map.get(key);
		list.add(new Pair(value, timestamp));
	}

	public String get(String key, int timestamp) {
		if (!map.containsKey(key))
			return "";
		
		List<Pair> list = map.get(key);
		return search(list, timestamp);
	}

	public String search(List<Pair> list, int timestamp) {
		int start = 0;
		int end = list.size() - 1;
		while (start < end) {
			int mid = start + (end - start + 1) / 2;
			if (list.get(mid).getValue() <= timestamp)
				start = mid;
			else
				end = mid - 1;
		}
		return list.get(start).getValue() <= timestamp ? list.get(start).getKey() : "";
	}
}