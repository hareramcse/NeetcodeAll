package com.hs.all.medium;

public class Pair {
	public String key;
	public Integer value;

	Pair(String key, Integer value) {
		this.key = key;
		this.value = value;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}
}
